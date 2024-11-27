package controllers.justcalcul;

public class DataController {

    private static final DataController dataC = new DataController();

    private String mrName;

    private String newAge;

    public void setName(String mrName){
        this.mrName = mrName;
    }

    public String getName(){
        return mrName;
    }

    public static DataController getDataC(){
        return dataC;
    }

    public void setAge(String newAge){
        this.newAge = newAge;
    }

    public String getAge(){
        return newAge;
    }

}
