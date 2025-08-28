public class EmployeeSalary {
    public static void main(String[] args){
        String names[]={"A","B","C"};
        int BasicSalary[]={50000,20000,40000};
        for(int i=0;i<names.length;i++){
            String name=names[i];
            int Basic=BasicSalary[i];

            double HRA =Basic*0.2;
            double DA=Basic*0.1;
            double netSalary=Basic+HRA+DA;
           
            if (netSalary>50000){
                netSalary=netSalary-0.1*(netSalary);
              
            } 
            System.out.println("Net Salary of employee "+name+" is "+ netSalary);
        }
    }
}
