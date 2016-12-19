package com.ilargia.games;


import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.ilargia.games.egdx.managers.EGTextureManager;
import com.ilargia.games.entitas.Systems;


public class Pong implements ApplicationListener {
    private static PongGame game;

    public static final int SCREEN_WIDTH = 800;
    public static final int SCREEN_HEIGHT = 480;
    public static final int PLAYER_WIDTH = 20;
    public static final int PLAYER_HEIGHT = 120;
    public static float PLAYER_SPEED = 300;


    public static void main(String[] arg) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title = "BASIC";
        config.width = SCREEN_WIDTH;
        config.height = SCREEN_HEIGHT;

        new LwjglApplication(new Pong(), config);
    }

    @Override
    public void create() {
        AssetManager assetsManager = new AssetManager();
        PongEngine engine = new PongEngine(new Systems(), new EGTextureManager(assetsManager));
        game = new PongGame(engine);
        PongState state = new PongState();
        game.init(null);
        game.pushState(state);

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void render() {
        game.runGame();
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {


    }


}