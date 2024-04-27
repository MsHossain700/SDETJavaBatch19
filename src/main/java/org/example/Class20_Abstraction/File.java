package org.example.Class20_Abstraction;
/*
create a class file that will have the following behaviors:
open(), edit(), close() and fields like name and size.
edit and close are implemented method while open is an abstract.
create 3 subclasses: javafile, wordfile, pdffile that will
provide specific implementation of open behavior: example to open
.java file we need notepad++ or sublime text, to open .doc file
we need microsoft word to be installed etc. create a tester class
and call all of the methods from these classes
 */
public abstract class File {

    private String name;
    private int size;

    File (String name, int size){
        this.name = name;
        this.size = size;
    }


    abstract void open();

    void edit(){
        System.out.println("Editing");
    }

    void close(){
        System.out.println("Closing");
    }

}

class JavaFile extends File{
     JavaFile(String name, int size){
        super(name, size);
    }

    void open(){
        System.out.println("Opening notepad++");
    }

}

class WordFile extends File{
    WordFile(String name, int size) {
        super(name, size);
    }
    void open(){
        System.out.println("Opening Microsoft word");
    }

}

class PdfFile extends File {
    PdfFile(String name, int size) {
        super(name, size);
    }
    void open(){
        System.out.println("Opening Adobe Acrobat");
    }

}

class FileTester{
    public static void main(String[] args) {
        File [] files={new JavaFile("JavaFile",1),new PdfFile("PdfFile",2),new WordFile("WordFile",3)};
        for (File f:files){
            f.open();
            f.edit();
            f.close();
        }
    }
}
