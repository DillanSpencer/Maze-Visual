package com.quad.core.components;

/**
 * @author Dillan Spencer
 * This class is the basic state for the game
 * Each state will:
 * Initiate
 * Update 
 * and then Render
 */

import com.quad.core.GameContainer;
import com.quad.core.Renderer;

public abstract class State
{
	public abstract void init(GameContainer gc);
	public abstract void update(GameContainer gc, float dt);
	public abstract void render(GameContainer gc, Renderer r);
	public abstract void dipose();
	
	
}
