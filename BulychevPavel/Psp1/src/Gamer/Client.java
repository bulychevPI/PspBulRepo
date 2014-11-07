/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Gamer;
import java.io.Serializable;
import java.util.Comparator;

/**
 *
 * @author HP
 */
public class Client implements Serializable, Comparator<Client>, ClientInterface {

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setScore(int score) {
        this.score = score;
    }
    public int getScore() {
        return this.score;
    }
    public String getNick() {
        return this.nick;
    }
    private String nick;
    private int score;
    private static final long serialVersionUID=1L;
    public Client(){}
    public Client(String n,int s)
    {
        nick=n;
        score=s;
    }
        
    public String toString(){
        return "\nNickname "+nick+" Score "+score;
    }

   

    @Override
    public int compare(Client o1, Client o2) {
        
       return o1.getScore()-o2.getScore();
    }
}
