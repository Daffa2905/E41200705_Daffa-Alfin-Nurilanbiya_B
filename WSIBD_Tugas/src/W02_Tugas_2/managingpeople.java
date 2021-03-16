/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W02_Tugas_2;

/**
 *
 * @author E41200705_Daffa Alfin Nurilanbiya
 */
public class managingpeople {

    public static void main(String[] args) {
        managingPeople_class p1 = new managingPeople_class("Arial", 37);
        managingPeople_class p2 = new managingPeople_class("Joseph", 15);

        if (p1.getAge() == p2.getAge()) {
            System.out.println(p1.getName() + " is the same age as " + p2.getName());
        } else {
            System.out.println(p1.getName() + " is NOT the same age as " + p2.getName());
        }

    }
}