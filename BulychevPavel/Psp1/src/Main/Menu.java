/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Main;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Menu {

    public Menu() {}
   
    public int mainMenu()
    {
        
        Scanner scan= new Scanner(System.in);
        System.out.println("Нажмите:\n 1.Добавить игрока\n 2.Просмотреть элементы\n 3.Изменить запись\n"
                + " 4.Удалить запись \n 5.Отсортировать записи по очкам\n 0.Выход");
        return scan.nextInt();
    }
}
    

