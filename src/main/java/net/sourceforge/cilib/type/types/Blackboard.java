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
package net.sourceforge.cilib.type.types;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Simple <tt>Blackboard</tt> implementation.
 * @author gpampara
 *
 * @param <K>
 * @param <V>
 */
public class Blackboard<K, V extends Type> extends AbstractType {
	private static final long serialVersionUID = -2589625146223946484L;
	private Map<K, V> board;
	
	public Blackboard() {
		this.board = new ConcurrentHashMap<K, V>();
	}
	
	public Blackboard(Blackboard<K, V> copy) {
		for (Map.Entry<K, V> entry : copy.board.entrySet()) {
    		K key = entry.getKey();
    		this.board.put(key, entry.getValue());
    	}
	}

	public Blackboard<K, V> getClone() {
		return new Blackboard<K, V>(this);
	}

	@Override
	public int getDimension() {
		return this.board.size();
	}

	@Override
	public String getRepresentation() {
		throw new UnsupportedOperationException("Implementation needed");
	}

	/**
	 * Not supported for <tt>Blackboard</tt>.
	 * @throws UnsupportedOperationException always
	 */
	@Override
	public boolean isInsideBounds() {
		throw new UnsupportedOperationException("Not supported");
	}

	/**
	 * Not supported for <tt>Blackboard</tt>.
	 * @throws UnsupportedOperationException always
	 */
	@Override
	public void randomise() {
		throw new UnsupportedOperationException("Not supported");
	}

	@Override
	public void reset() {
		this.board.clear();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public V put(K key, V value) {
		return this.board.put(key, value);
	}
	
	public V get(K key) {
		return this.board.get(key);
	}
	
	public Set<Map.Entry<K, V>> entrySet() {
		return this.board.entrySet();
	}

}
