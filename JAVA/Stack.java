import java.util.*;

public class Stack2
{
    static class Employee{

         
        private String fName;
        private String lName;
        private int id;

        public Employee(String f,String l,int id)
        {
            this.fName=f;
            this.lName=l;
            this.id=id;
        }

        public String getFname()
        {
             return fName;
        }
        public void setFname(String f)
        {
            this.fName=f;
        }

        public String getLname()
        {
             return lName;
        }
        public void setLname(String l)
        {
            this.lName=l;
        }

        public int getId()
        {
             return id;
        }
        public void setId(int id)
        {
            this.id=id;
        }

        public String toString()
        {
            return "Employee("+
                    "first Name :"+fName+" ,"+
                    "last Name :"+lName+" ,"+
                    "id :"+id+")";
        }
        
        @Override
        public boolean equals(Object o)
        {
            if(this==o)
              return true;

            if(o==null || getClass() != o.getClass())
              return false;
              
            Employee emp=(Employee)o;
            
            if(id !=emp.id)
              return false;

            if(!fName.equals(emp.fName))
              return false;  

            return lName.equals(emp.lName);  
        }

    }

    static class LinkedStack
    {
        private LinkedList<Employee> stack; //doubly linked list

        public LinkedStack()
        {
            stack=new LinkedList<Employee>();
        }

        public void push(Employee e)
        {
            stack.push(e);

        }

        public Employee pop()
        {
            return stack.pop();
        }

        public Employee peek()
        {
            return stack.peek();
        }

        public boolean isEmpty()
        {
            return stack.isEmpty();
        }

        public void printStack()
        {
            ListIterator<Employee> it=stack.listIterator();
            while(it.hasNext())
            {
                System.out.println(it.next());
            }
        }
    }
    public static void main(String[] args) {
        //implementing the stack using linked list

        Employee jj=new Employee("Jane", "Jones", 123);
        Employee mj=new Employee("Micheal", "Jackson", 420);
        Employee ed=new Employee("Ed", "Sheeran", 1899);
        Employee mc=new Employee("Miley", "Cyrus", 452);
        Employee fc=new Employee("50", "Cents", 546);

        LinkedStack st= new LinkedStack();
        st.push(jj);
        st.push(mj);
        st.push(ed);
        st.push(mc);
        st.push(fc);

        st.printStack();

        System.out.println();
        System.out.println(st.peek());


        System.out.println("Employee Popped : "+ st.pop());
    }
}
