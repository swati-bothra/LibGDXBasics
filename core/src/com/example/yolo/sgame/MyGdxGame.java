package com.example.yolo.sgame;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.input.GestureDetector;
import com.badlogic.gdx.math.Vector2;

import sun.rmi.runtime.Log;


//public class MyGdxGame extends ApplicationAdapter implements InputProcessor {
//
//
//    private SpriteBatch batch;
//    private BitmapFont font;
////    private Texture img;
////    private Sprite sprite;
//    private GlyphLayout glyphLayout;
//
////    private TextureAtlas textureAtlas;
////    private Animation animation;
////    private float timepassed=0;
//
//    private int screenHeight,screenWidth;
//    private String msg = "LibGDX Rocks!!!";
//
//
//    @Override
//    public void create() {
//        batch = new SpriteBatch();
//        font = new BitmapFont();
//        font.setColor(Color.MAROON);
//        font.getData().scale(5);
//
//
////        img = new Texture("badlogic.jpg");
////        sprite = new Sprite(img);
//
////        textureAtlas = new TextureAtlas(Gdx.files.internal("flagAnim.atlas"));
////        animation = new Animation(1/10f,textureAtlas.getRegions());
//
//        screenHeight = Gdx.graphics.getHeight();
//        screenWidth = Gdx.graphics.getWidth();
//        glyphLayout = new GlyphLayout();
//
//        Gdx.input.setInputProcessor(this);
//
//    }
//
//    @Override
//    public void dispose() {
//        batch.dispose();
//        font.dispose();
//  //      img.dispose();
////        textureAtlas.dispose();
//    }
//
//    @Override
//    public void render() {
//        Gdx.gl.glClearColor(1,1,1,1);
//        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
//
//
//        //for centerlize text
//
//
//
//        float x = screenWidth/2 - glyphLayout.width/2;
//        float y = screenHeight/2 + glyphLayout.height/2;
//
//        batch.begin();
//
////        font.draw(batch,"LibGDX Rocks!!!",300,300);
//
//
////        sprite.draw(batch);
//
////        timepassed += Gdx.graphics.getDeltaTime();
////        batch.draw((TextureRegion) animation.getKeyFrame(timepassed,true),500,500);
//
//        glyphLayout.setText(font,msg);
//        font.draw(batch,glyphLayout,x,y);
//
//        batch.end();
//    }
//
//
//
//    @Override
//    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
//        msg = "Touch down at "+ screenX +", "+screenY;
//        return true;
//    }
//
//    @Override
//    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
//        msg = "Touch Up at "+ screenX +", "+screenY;
//        return true;
//    }
//
//    @Override
//    public boolean touchDragged(int screenX, int screenY, int pointer) {
//        return false;
//    }
//
//
//    @Override
//    public boolean keyDown(int keycode) {
//        return false;
//    }
//
//    @Override
//    public boolean keyUp(int keycode) {
//        return false;
//    }
//
//    @Override
//    public boolean keyTyped(char character) {
//        return false;
//    }
//
//    @Override
//    public boolean mouseMoved(int screenX, int screenY) {
//        return false;
//    }
//
//    @Override
//    public boolean scrolled(int amount) {
//        return false;
//    }
//}


//
//
//public class MyGdxGame extends ApplicationAdapter implements GestureDetector.GestureListener{
//
//    private SpriteBatch batch;
//    private Texture texture;
//    private Sprite sprite;
//    private OrthographicCamera camera;
//
//    @Override
//    public void create() {
//        batch = new SpriteBatch();
//        camera = new OrthographicCamera(Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
//        texture = new Texture(Gdx.files.internal("images.jpg"));
//        sprite = new Sprite(texture);
//        sprite.setPosition(-sprite.getWidth()/2,-sprite.getWidth()/2);
//        Gdx.input.setInputProcessor(new GestureDetector(this));
//    }
//
//
//
//    @Override
//    public void dispose() {
//        batch.dispose();
//        texture.dispose();
//    }
//
//
//    @Override
//    public void render() {
//        Gdx.gl.glClearColor(1,1,1,1);
//        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
//
//        batch.setProjectionMatrix(camera.combined);
//        batch.begin();
//        sprite.draw(batch);
//        batch.end();
//    }
//
//
//    @Override
//    public boolean pan(float x, float y, float deltaX, float deltaY) {
//        camera.translate(-deltaX,deltaY);
//        camera.update();
//        return true;
//    }
//
//    @Override
//    public boolean touchDown(float x, float y, int pointer, int button) {
//        return false;
//    }
//
//    @Override
//    public boolean tap(float x, float y, int count, int button) {
//        return false;
//    }
//
//    @Override
//    public boolean longPress(float x, float y) {
//        return false;
//    }
//
//    @Override
//    public boolean fling(float velocityX, float velocityY, int button) {
//        return false;
//    }
//
//
//
//    @Override
//    public boolean panStop(float x, float y, int pointer, int button) {
//        return false;
//    }
//
//    @Override
//    public boolean zoom(float initialDistance, float distance) {
//        return false;
//    }
//
//    @Override
//    public boolean pinch(Vector2 initialPointer1, Vector2 initialPointer2, Vector2 pointer1, Vector2 pointer2) {
//        return false;
//    }
//
//    @Override
//    public void pinchStop() {
//
//    }
//}



public class MyGdxGame extends ApplicationAdapter implements InputProcessor{


    private SpriteBatch batch;
    private Music music;
    private Sound sound;

    @Override
    public void create() {
        batch = new SpriteBatch();
        Gdx.input.setInputProcessor(this);
//        sound = Gdx.audio.newSound(Gdx.files.internal("beach.wav"));
        music = Gdx.audio.newMusic(Gdx.files.internal("beach.wav"));

    }

    @Override
    public void dispose() {
        batch.dispose();
        sound.dispose();
        music.dispose();
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(1,1,1,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.end();
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        music.play();
//        Long id = sound.play();
//        sound.setVolume(id,0.9f);
//        sound.setPitch(id,0.5f);
        return true;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        music.pause();
        return true;
    }


    @Override
    public boolean keyDown(int keycode) {
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }


    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }
}