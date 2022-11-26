package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Magic extends kg.geektech.game.players.Hero {
    public Magic(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.BOOST);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0 && this != heroes[i]) {
                heroes[i].setDamage(heroes[i].getDamage() +  getDamage());

            }




        }


        }

    }

