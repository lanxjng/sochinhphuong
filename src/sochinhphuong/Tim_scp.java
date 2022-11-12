/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sochinhphuong;

/**
 *
 * @author admin
 */
public class Tim_scp {
    private int n;
    
    public Tim_scp(int n){
        this.n = n;
    }
    
    public boolean KT(int n1){
        int sqr =(int) Math.sqrt(n1);
        if(n1 == sqr*sqr)
            return true;
        return false;
    }
    public String SoCP(){
        String kq="";
        for(int i=0; i<n;i++)
            if(KT(i))
                kq+= i+" ";
            return kq;
    }
    
}
