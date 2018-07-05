package software.msouti.javajoker;

import java.util.Random;

public class Joker {

    private String[] jokes=new String[]{"Software developers like to solve problems.\nIf there are no problems handily available\nThey will create their own problems !"
            ,"I'd like to make world a better place ....\n BUT they won't give me the source code !"
            ,"Hide and seek Champion ..... \n ; \n since 1958"
            ,"Code Never Lie ...\n Comment's sometimes do"
            ,"Hardware (noun).\n The part of computer that you can KICK !"};




    public String tellJoke() {
        Random random = new Random();
        int x = random.nextInt(4);
        return jokes[x];
    }
}
