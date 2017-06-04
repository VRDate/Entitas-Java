package ilargia.entitas.codeGeneration.plugins.postProcessors

import groovy.transform.TypeCheckingMode
import ilargia.entitas.codeGeneration.interfaces.IAppDomain
import ilargia.entitas.codeGeneration.plugins.config.TargetPackageConfig
import ilargia.entitas.codeGeneration.data.CodeGenFile

import ilargia.entitas.codeGeneration.gradle.EntitasGradleProject
import ilargia.entitas.codeGeneration.plugins.dataProviders.ProviderUtils
import ilargia.entitas.codeGeneration.plugins.dataProviders.components.ComponentData
import ilargia.entitas.codeGeneration.utils.CodeGeneratorUtil
import ilargia.entitas.fixtures.FixtureProvider
import org.gradle.api.Project
import org.gradle.api.plugins.JavaPlugin
import org.gradle.testfixtures.ProjectBuilder
import org.jboss.forge.roaster.model.source.JavaClassSource
import spock.lang.Narrative
import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Title

@Narrative("""
Como usuario de la aplicacion
Quiero poder crear los ficheros en disco con el codigo generado
Para falicitarme el desarrollo en la aplicacion.
""")
@Title(""" """)
//@groovy.transform.TypeChecked
class WriteToDiskPostProcessorSpec extends Specification {

    @Shared
    FixtureProvider fixtures
    @Shared
    WriteToDiskPostProcessor postProcessor
    @Shared
    List<CodeGenFile<JavaClassSource>> genFiles
    @Shared
    List<ComponentData> dataFiles

    def setupSpec() {
        Project project = ProjectBuilder.builder().build()
        JavaPlugin plugin = project.getPlugins().apply(JavaPlugin.class)
        IAppDomain appProject = new EntitasGradleProject(project)
        postProcessor = new WriteToDiskPostProcessor()
        postProcessor.setAppDomain(appProject)
        dataFiles = ProviderUtils.getComponentDatas(appProject, new ArrayList<String>(){{ add("ilargia.entitas.codeGeneration.plugins.config")}})
        genFiles = new ArrayList<>()



    }

    @groovy.transform.TypeChecked(TypeCheckingMode.SKIP)
    void 'Consultamos al proveedor ComponentDataProvider por los contextos extraidos de los componentes'() {
        given:
        Spy(CodeGeneratorUtil)
        Properties prop = new Properties()
        postProcessor.configure(prop)

        when:
        Properties prop2 = postProcessor.getDefaultProperties()

        then:
        prop == prop2
        prop.getProperty(TargetPackageConfig.TARGET_PACKAGE_KEY) == "entitas.generated"
        postProcessor.getName() == "Write to disk"
        postProcessor.gePriority() == 100
        postProcessor.isEnableByDefault() == true
        postProcessor.runInDryMode() == false


    }

    void 'Consultamos2 al proveedor ComponentDataProvider por los contextos extraidos de los componentes'() {
        given:
        Spy(CodeGeneratorUtil)
        Properties prop = new Properties()
        postProcessor.configure(prop)
        postProcessor.getDefaultProperties()
        for (ComponentData df : dataFiles) {
            CodeGenFile<JavaClassSource> codeGenFile = new CodeGenFile("", df.getSource(), df.getSubDir())
            genFiles.add(codeGenFile)
        }

        when:
        File file = postProcessor.createFile(genFiles.get(0).fileName, genFiles.get(0).subDir, genFiles.get(0).fileContent);

        then:
        1 * CodeGeneratorUtil.writeFile(*_)
        println file.getCanonicalPath()
        file.getName().contains('CustomIndex.java')
        file.getCanonicalPath().contains('CustomIndex.java')


    }
}