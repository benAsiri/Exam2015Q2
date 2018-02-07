package exam2015q2;
import java.lang.reflect.*;
import java.lang.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dileeparajapaksa
 */
public class Exam2015Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {
        // TODO code application logic here
        
        String[] classList = {"ClassA","ClassB"};
        searchClass("ClassY", classList);
        
    }
    
    public static void searchClass(String className, String[] classes) throws 
            ClassNotFoundException
    {
     
         Class _searchClass = Class.forName(className);
         Class _superClass = _searchClass.getSuperclass();
         
         ArrayList<Class> _classList= new ArrayList<Class>();
         
         for(String s:classes)
         {
             _classList.add(Class.forName(s));
                        
         }      
         
          for(Class _aClass: _classList){                 
                 Method[] _methods = _aClass.getMethods();
                 for(Method m : _methods)
                 {                     
                     if(m.getReturnType().equals(_searchClass)||
                             m.getReturnType().equals(_superClass))
                     {
                         System.out.println(_aClass+"."+m.getName());
                     }
                 }                
             }
    }
 }

