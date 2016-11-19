package com.ilargia.games.entitas.codeGenerator.intermediate;

import com.ilargia.games.entitas.codeGenerator.CodeGenerator;
import org.jboss.forge.roaster.model.source.FieldSource;
import org.jboss.forge.roaster.model.source.JavaClassSource;

import java.util.List;

public class ComponentInfo {

    public String nameComponent;
    public String fullTypeName;
    public List<FieldSource<JavaClassSource>> memberInfos;
    public List<String> pools;
    public boolean isSingleEntity;
    public String singleComponentPrefix;
    public boolean generateComponent;
    public boolean generateMethods;
    public boolean generateIndex;
    public boolean hideInBlueprintInspector;
    public String typeName;
    public boolean isSingletonComponent;

    public ComponentInfo(String fullTypeName, String typeName, List<FieldSource<JavaClassSource>> memberInfos, List<String> pools,
                         boolean isSingleEntity, String singleComponentPrefix,
                         boolean generateComponent, boolean generateMethods, boolean generateIndex, boolean hideInBlueprintInspector) {

        this.fullTypeName = fullTypeName;
        this.memberInfos = memberInfos;
        this.pools = pools;
        this.isSingleEntity = isSingleEntity;
        this.singleComponentPrefix = (singleComponentPrefix != null && !singleComponentPrefix.isEmpty()) ? singleComponentPrefix : "";
        this.generateComponent = generateComponent;
        this.generateMethods = generateMethods;
        this.generateIndex = generateIndex;
        this.hideInBlueprintInspector = hideInBlueprintInspector;
        this.typeName = typeName;
        this.nameComponent = (typeName.contains(CodeGenerator.COMPONENT_SUFFIX))
                ? typeName
                : typeName + CodeGenerator.COMPONENT_SUFFIX;

        isSingletonComponent = memberInfos == null || memberInfos.size() == 0;
    }


    @Override
    public String toString() {
        return "ComponentInfo {" +
                "\n    nameComponent='" + nameComponent + '\'' +
                ",\n    fullTypeName='" + fullTypeName + '\'' +
                ",\n    memberInfos=" + memberInfos +
                ",\n    pools=" + pools +
                ",\n    isSingleEntity=" + isSingleEntity +
                ",\n    singleComponentPrefix='" + singleComponentPrefix + '\'' +
                ",\n    generateComponent=" + generateComponent +
                ",\n    generateMethods=" + generateMethods +
                ",\n    generateIndex=" + generateIndex +
                ",\n    hideInBlueprintInspector=" + hideInBlueprintInspector +
                ",\n    typeName='" + typeName + '\'' +
                ",\n    isSingletonComponent=" + isSingletonComponent +
                "\n}";
    }
}
