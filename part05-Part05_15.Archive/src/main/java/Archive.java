/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mahamud
 */
public class Archive {
   private String identifier; 
   private String name;
   
   public Archive(String identifier, String name){
       this.identifier = identifier;
       this.name = name;
   }
   
   public String getName(){
       return this.name;
   }
   
   public String getIdentifier(){
       return this.identifier;
   }
   
   public boolean equals(Object compare){
       if(this == compare){
           return true;
       }
       
       if(!(compare instanceof Archive)){
           return false;
       }
       
       Archive comparedArchive = (Archive) compare;
       
       return this.identifier.equals(comparedArchive.identifier);
   }
   
   public String toString(){
       return this.identifier + ": " + this.name; 
   }
}
