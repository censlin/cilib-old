/*
 * Copyright (C) 2003 - 2008
 * Computational Intelligence Research Group (CIRG@UP)
 * Department of Computer Science
 * University of Pretoria
 * South Africa
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
package net.sourceforge.cilib.games.items;

import net.sourceforge.cilib.util.Cloneable;

/**
 * 
 * @author leo
 * Any object that exists in the game.
 */
public abstract class GameItem implements Cloneable {
	private static final long serialVersionUID = -5725025967973967757L;
	
	protected ItemLocation itemLocation;

	public GameItem(){
		
	}
	
	public GameItem(GameItem other){
		itemLocation = other.itemLocation.getClone();
	}
	
	public void setLoction(ItemLocation location){
		itemLocation = location;
	}
	
	public ItemLocation getLocation(){
		return itemLocation;		
	}
	
	public abstract GameItem getClone();

}
