package com.programit.week2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;

/**
 * Created by Bas on 19/06/16.
 */
class CException {

    void thrower(int index) throws MyException3 {
        try {
            switch (index) {
                case 1: throw new FileNotFoundException();
                case 2: throw new ClassNotFoundException();
                case 3: throw new IOException();
                case 4: throw new MyException1();
                case 5: throw new Exception();
                case 6: throw new Throwable();
                case 7: throw new MyException1_1();
                case 8: throw new MyException3();
                case 9: throw new Error();
            }
        }
        catch (MyException3 e) {
            System.out.println("Caught MyException3");
            throw e;
        }
        catch (MyException1_1 e) {
            System.out.println("Caught MyException1_1");
        }
        catch (FileNotFoundException|ClassNotFoundException|MyException1|MyException2 e) {
            if (e instanceof FileNotFoundException) {
                System.out.println("Caught FileNotFoundException");
            } else if (e instanceof ClassNotFoundException) {
                System.out.println("Caught ClassNotFoundException");
            } else if (e instanceof MyException1) {
                System.out.println("Caught MyException1");
            } else {
                System.out.println("Caught MyException2");

            }
        }

        catch (IOException e) {
            System.out.println("Caught IOException");
        }
        catch (Exception e) {
            System.out.println("Caught Exception");
        }
        catch (Error e) {
            System.out.println("Caught Error");
        }
        catch (Throwable e) {
            System.out.println("Caught Throwable");
        }

    }
}

class MyException1 extends IOException {}

class MyException2 extends IOException {}

class MyException1_1 extends MyException1 {}

class MyException3 extends Throwable {
    final String beschrijving = "Beschrijving van MyException3";
}

interface Driveable extends Serializable, Mountable {}

interface Mountable {}

interface Inflammable {}