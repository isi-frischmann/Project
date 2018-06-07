class ProjectTest{
    public static void main(String[] args){
        // using the different Constructor:
        Project project1 = new Project("Interview", "Get job");
        Project project2 = new Project("Move", "Book relocation service");
        Project project3 = new Project();
        Project project4 = new Project("Vacation");
        System.out.println(project1); //OUTPUT: the memory location
        System.out.println(project1.elevatorPitch()); //This will print the project info
        System.out.println(project3.elevatorPitch()); //OUTPUT: null, null
        System.out.println(project4.elevatorPitch()); //OUTPUT: null, Vacation
    }
}