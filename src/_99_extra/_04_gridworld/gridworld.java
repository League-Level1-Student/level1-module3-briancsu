package _99_extra._04_gridworld;

import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class gridworld {
	public static void main(String[] args) {
		World world = new World();
		world.show();
		Location location1 = new Location(5,5);
		Bug bug1 = new Bug();
		world.add(location1, bug1);
		Location location2 = new Location(2,2);
		Bug bug2 = new Bug();
		Color color = new Color(0,0,255);
		bug2.setColor(color);
		bug2.turn();
		world.add(location2, bug2);
		Location location3 = new Location(2,1);
		Location location4 = new Location(2,3);
		Flower flower1 = new Flower();
		Flower flower2 = new Flower();
		world.add(location3, flower1);
		world.add(location4, flower2);
		
	}
}
