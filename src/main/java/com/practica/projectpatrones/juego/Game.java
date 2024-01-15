package com.practica.projectpatrones.juego;

import javax.swing.JFrame;

public class Game extends JFrame implements Runnable{
    
    private boolean execute = false;
    private Thread threadGame;

    public Game(){
        this.execute = true;
    }

    @Override
    public void run() {
        while(execute){
            
        }
    }

    public void update(){
        
    }

    public void start(){
        threadGame = new Thread(this);
        threadGame.start();
        execute = true;
    }

    public void stop(){
        this.execute = false;
    }
}
