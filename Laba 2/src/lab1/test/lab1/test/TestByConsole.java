package lab1.test.lab1.test;

import lab1.model.lab1.model.Wood;
import lab1.model.lab1.model.lab1.model.Cylinder;
import lab1.model.lab1.model.lab1.model.IWeight;
import lab1.model.lab1.model.lab1.model.Timber;
import lab1.store.lab1.store.WoodDirectory;
import lab1.store.lab1.store.lab1.store.lab1.store.ProductStore;

import java.util.Scanner;

public class  TestByConsole

{
    private WoodDirectory wd = new WoodDirectory();
    private ProductStore ps = new ProductStore();
    private Scanner scan=new Scanner(System.in);
    public void Start(){
        boolean exit = true;
        while(exit){
            System.out.println("1 додати деревину");
            System.out.println("2 додати брусок");
            System.out.println("3 додати циліндер");
            System.out.println("4 підрахувати загальну вагу");
            System.out.println("5 завершити роботу");
            int command = scan.nextInt();
            switch(command){
                case 1:
                    System.out.println(1);
                    addWood();
                    break;
                case 2:
                    System.out.println(2);
                    addTimber();
                    break;
                case 3:
                    System.out.println(3);
                    addCylinder();
                    break;
                case 4:
                    System.out.println(4);
                    calcWeight();
                    break;
                case 5:
                    System.out.println(5);
                    exit=false;
                    break;
            }
        }
    }
    public void addWood(){
        System.out.print("id ");
        int id = scan.nextInt();
        System.out.print("name ");
        scan.nextLine();
        String name = scan.next();
        System.out.print("density ");
        float density = scan.nextFloat();
        wd.add(new Wood(id, name, density));
        System.out.println(wd);
    }
    public void addTimber(){
        System.out.print("id ");
        int id = scan.nextInt();
        System.out.print("length ");
        float length = scan.nextFloat();
        System.out.print("height" );
        float height = scan.nextFloat();
        System.out.print("width ");
        float width = scan.nextFloat();
        ps.add(new Timber(wd.get(id), length, height, width));
        System.out.println(ps);
    }
    public void calcWeight()
    {
        float fullWeight=0;
        for(Object timber: ps.getArr())
        {
            fullWeight+=((IWeight)timber).weight();
        }
        System.out.println(fullWeight);
    }
    public void addCylinder(){
        System.out.print("id ");
        int id = scan.nextInt();
        System.out.print("diameter ");
        float diameter = scan.nextFloat();
        System.out.print("length ");
        float length = scan.nextFloat();
        ps.add(new Cylinder(wd.get(id), length, diameter));
        System.out.println(ps);
    }
}
