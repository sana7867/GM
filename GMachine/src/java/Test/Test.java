/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import dao.IDao;
import entities.Machine;
import entities.Salle;

import service.MachineService;
import service.SalleService;

/**
 *
 * @author Tecra
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
    
        
            IDao<Salle> dao2 = new SalleService();
            dao2.create(new Salle("code1"));
            dao2.create(new Salle("code2"));
             for(Salle s :dao2.findAll()){
                System.out.println(s);
            }
            IDao<Machine> dao1 = new MachineService();
            dao1.create(new Machine("HP", "ref1", 10000));
            dao1.create(new Machine("HP", "ref2", 2000));
            dao1.create(new Machine("Mac", "ref3", 30000));
            for (Machine m : dao1.findAll()) {
                System.out.println(m);
            }
 
         
        }}

    

