package com.vishwa.lld.designpattern.behavioraldesignpattern.observer;

public class ObserverPatternTest {

  public static void main(String[] args) {

    VishwaBatch vishwaBatch = new VishwaBatch();




    ObserverStudent student1 = new MyBatchSubscriber("Mohan");
    ObserverStudent student2 = new MyBatchSubscriber("Rohan");
    ObserverStudent student3 = new MyBatchSubscriber("Sohan");
    ObserverStudent student4 = new MyBatchSubscriber("Geeta");

    /**
     * Registering students to the batch
     */
    vishwaBatch.register(student1);
    vishwaBatch.register(student2);
    vishwaBatch.register(student3);
    vishwaBatch.register(student4);

    /**
     * Attaching the teacher with the students
     */
    student1.setVishwaSessions(vishwaBatch);
    student2.setVishwaSessions(vishwaBatch);
    student3.setVishwaSessions(vishwaBatch);
    student4.setVishwaSessions(vishwaBatch);


    student1.update();

    vishwaBatch.addStudyTopic("Observer pattern");

  }
}
