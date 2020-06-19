/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fun_Facts;

/**
 *
 * @author zono
 */
public class Fun_facts {
    static String[] ff = new String[21];
    
    /**
     *
     * @return
     */
  
    public static String getFunFacts() {
	
        ff[0] = "Don't like mosquitos?  Get a bat.  They eat 3,000 insects a night.";
        ff[1] = "An ostrich’s eye is bigger than its whole brain.";
        ff[2] = "About 70% of an adult’s body is water.";
        ff[3] = "You can not talk and inhale or exhale at the same time… try it!";
        ff[4] = "Your heart is about the same size as your fist.";
        ff[5] = "Frogs drink water through their skin.";
        ff[6] = "It is impossible to lick your own elbow";
        ff[7] = "You speak about 4,800 words a day.";
        ff[8] = "The Earth is 4.5 billion years old.";
        ff[9] = "Honey is the only food that won’t spoil.";
        ff[10] = "Cows have four stomachs.";
        ff[11] = "A cow needs to drink four gallons of water to make one gallon of milk.";
        ff[12] = "Cats sleep about 16 hours a day.";
        ff[13] = "Your eyes blink all day long to keep them clean.";
        ff[14] = "Each of your hands has 14 finger bones.";
        ff[15] = "Kangaroos can’t walk backwards.";
        ff[16] = "Cucumbers are actually a fruit and not a vegetable. They are a part of the melon family.";
        ff[17] = "Pencils can write in space with zero gravity and also underwater.";
        ff[18] = "A rainbow occurs when it is raining in one part of the sky and sunny in another.";
        ff[19] = "Pandas eat roughly 28 pounds of bamboo each day. In fact, they spend around 12 hours of their day eating!";
        ff[20] = "Kangaroos can’t walk backwards.";
 
        int index = (int)(Math.random() * 20);
        
        return ff[index];
		
    }
	
}
