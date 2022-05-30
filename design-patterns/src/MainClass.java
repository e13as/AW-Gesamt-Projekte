public class MainClass {

    public static void main(String[] args) {

        TaskManager manager = TaskManagerFactory.createTaskManager();

       // Task a = new TaskImpl("Wäsche waschen");
      //  manager.addTask(a);
      //  Task b = new TaskImpl("Küche putzen");
       // manager.addTask(b);

      //  manager.performTasks();

        //----------------------------------------------------------//


        TaskGroup einkaufen = new TaskGroup("Einkaufen");
        TaskGroup baecker = new TaskGroup("Bäcker");
        baecker.addSubTask(new TaskImpl("Brezen"));
        baecker.addSubTask(new TaskImpl("Semmeln"));
        einkaufen.addSubTask(baecker);

        TaskGroup supermarkt = new TaskGroup("Supermarkt");
        TaskGroup gemuese = new TaskGroup("Gemüse");
        gemuese.addSubTask(new TaskImpl("Gurke"));
        gemuese.addSubTask(new TaskImpl("Tomaten"));
        einkaufen.addSubTask(gemuese);

        TaskGroup kuehlschrank = new TaskGroup("Kühlschrank");
        kuehlschrank.addSubTask(new TaskImpl("Butter"));
        supermarkt.addSubTask(kuehlschrank);
        einkaufen.addSubTask(supermarkt);

        TaskGroup putzen = new TaskGroup("Putzen");
        TaskGroup badezimmer = new TaskGroup("Badezimmer");
        badezimmer.addSubTask(new TaskImpl("Badewanne"));
        badezimmer.addSubTask(new TaskImpl("Waschbecken"));
        putzen.addSubTask(badezimmer);

        TaskGroup küche = new TaskGroup("Küche");
        küche.addSubTask(new TaskImpl("Waschbecken"));
        küche.addSubTask(new TaskImpl("Tisch"));
        Task zaehnePutzen = new TaskImpl("Zähne putzen");
        ImportantTask zaehnePutzenWichtig = new ImportantTask(zaehnePutzen);

        putzen.addSubTask(küche);
        manager.addTask(einkaufen);
        manager.addTask(putzen);
        manager.addTask(zaehnePutzenWichtig);





        manager.performTasks();


        
    }
}
