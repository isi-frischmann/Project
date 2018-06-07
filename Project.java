public class Project{
    private String name;
    private String description;

    // getter
    // for getter you don't need a void but a return because you want to return something
    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    // setter
    // for the setter you need a void because you're setting something
    public void setName(String name){
        this.name = name;
    }

    public void setDescription(String description){
        this.description = description;
    }

    // method
    // Methods are to do something with the projects
    public String elevatorPitch(){
        return description + ", " + name;
    }

    // The Constructor are to create Projects
    // constructor overload 1.------------------ 
    public Project(){
    }

    // constructor overload 2.------------------
    public Project(String name) {
        this.name = name;
    }

    // constructor overload 3.------------------
    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }

}