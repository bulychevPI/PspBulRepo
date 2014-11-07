package Main;

import Gamer.Client;
import Gamer.Serializator;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.util.ArrayList;
import java.util.Collections;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;




public class Main {

        @SuppressWarnings("empty-statement")
	public static void main(String[] args) throws InvalidObjectException, IOException {
		// TODO Auto-generated method stub
//		HostelRoom my_room = new HostelRoom(155, "Paul");
//		System.out.println(my_room.GetNumber() + " " + my_room.getOwner());
//		Room newR;
//		newR = new VIP_Hostel(10, "pp");
//		if(my_room.CleanRoom("ff"))System.out.println(my_room.GetNumber());
//		List<Room> rooms = new ArrayList<Room>();
//		
//		rooms.add(newR);
//		for(int i=0;i<10;i++){
//			my_room.setNumber(i);
//			rooms.add(my_room);
//		}
//		Iterator<Room> it=rooms.iterator();
//		while(it.hasNext()){
//			System.out.println(it.next().GetNumber());
//		}
            
            Menu menu= new Menu();
            Client var= new Client();
            Scanner sc= new Scanner(System.in);
            List<Client> clients=new ArrayList<Client>();
            Serializator sz = new Serializator();
            String fileN = "lab1.txt";
            if(sz.exist(fileN))
            {
                clients.addAll(sz.deserialization(fileN));
            }else sz.creatF(fileN);

            while(true)
            {
                int sw=menu.mainMenu();
                switch(sw)
                {
                    case 1:
                    {

                        Client temp = new Client("",0);
                        System.out.println("nickname enter:");
                        temp.setNick(sc.nextLine());
                        System.out.println("score enter:");
                        temp.setScore(sc.nextInt());
                        clients.add(temp);

                    }break;
                    case 2:
                    {
                        String temp= new String();
                        for(Client cl:clients)System.out.println(cl);
                        System.out.println("Press 'Enter' to continue");
                        System.in.read();

                    }break;
                    case 3:
                    {
                        int ind;
                        System.out.println("Enter index");
                        ind=sc.nextInt();
                        System.out.println("nickname enter:");
                        clients.get(ind).setNick(sc.next());
                        System.out.println("score enter:");
                        clients.get(ind).setScore(sc.nextInt());
                    }break;
                    case 4:
                    {
                        int ind;
                        System.out.println("Enter index");
                        ind=sc.nextInt();
                        System.out.println("Эта запись удалена");
                        System.out.println(clients.get(ind));
                        clients.remove(ind);
                        System.in.read();
                    }break;
                    case 5:
                    {
                        Collections.sort(clients,var);
                    }break;
                    case 0:
                    {
                        sz.serialization(clients, fileN);
                        return;
                    }
                }




    /*
    // чтение и вывод объекта
    Client res = new Client("",0);
    try {
    res = sz.deserialization(fileName);
    } catch (InvalidObjectException e) {
    // обработка
    e.printStackTrace();
    }
    System.out.println(res);
    List<Client> kls=new ArrayList<Client>();
        */        
            }
        }
            

}
