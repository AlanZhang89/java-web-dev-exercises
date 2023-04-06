package org.launchcode.java.demos;

import java.util.HashMap;

/**
 * From "Java Web Development"
 */
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, World");
        HashMap<String, Integer> moons = new HashMap<>();
        moons.put("Mercury", 0);
        moons.put("Venus", 0);
        moons.put("Earth", 1);
        moons.put("Mars", 2);
        moons.put("Jupiter", 79);
        moons.put("Saturn", 82);
        moons.put("Uranus", 27);
        moons.put("Neptune", 14);
        System.out.println(moons.keySet());
    }
}
