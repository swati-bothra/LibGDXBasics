package com.example.yolo.sgame;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import sun.rmi.runtime.Log;


public class MyGdxGame extends ApplicationAdapter implements InputProcessor {


    private SpriteBatch batch;
    private BitmapFont font;
//    private Texture img;
//    private Sprite sprite;
    private GlyphLayout glyphLayout;

//    private TextureAtlas textureAtlas;
//    private Animation animation;
//    private float timepassed=0;

    private int screenHeight,screenWidth;
    private String msg = "LibGDX Rocks!!!";


    @Override
    public void create() {
        batch = new SpriteBatch();
        font = new BitmapFont();
        font.setColor(Color.MAROON);
        font.getData().scale(5);


//        img = new Texture("badlogic.jpg");
//        sprite = new Sprite(img);

//        textureAtlas = new TextureAtlas(Gdx.files.internal("flagAnim.atlas"));
//        animation = new Animation(1/10f,textureAtlas.getRegions());

        screenHeight = Gdx.graphics.getHeight();
        screenWidth = Gdx.graphics.getWidth();
        glyphLayout = new GlyphLayout();

        Gdx.input.setInputProcessor(this);

    }

    @Override
    public void dispose() {
        batch.dispose();
        font.dispose();
  //      img.dispose();
//        textureAtlas.dispose();
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(1,1,1,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);


        //for centerlize text



        float x = screenWidth/2 - glyphLayout.width/2;
        float y = screenHeight/2 + glyphLayout.height/2;

        batch.begin();

//        font.draw(batch,"LibGDX Rocks!!!",300,300);


//        sprite.draw(batch);

//        timepassed += Gdx.graphics.getDeltaTime();
//        batch.draw((TextureRegion) animation.getKeyFrame(timepassed,true),500,500);

        glyphLayout.setText(font,msg);
        font.draw(batch,glyphLayout,x,y);

        batch.end();
    }



    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        msg = "Touch down at "+ screenX +", "+screenY;
        return true;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        msg = "Touch Up at "+ screenX +", "+screenY;
        return true;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
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
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }
}
