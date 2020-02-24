package com.madapas.recycleviewdemo.storage;

import com.madapas.recycleviewdemo.model.Note;

import java.util.ArrayList;

public class NoteStorage {
    public static ArrayList<Note> getList() {
        return list;
    }


    private static ArrayList<Note> list;
    private static final  String fileName = "data.dat";
    private static FileStorage fileStorage;

    static { //static block, used to initialize static variables
        list = new ArrayList<>();
        Note note = new Note("Note1", "Body1");
        list.add(note);
        list.add(note);
        list.add(note);
        list.add(note);
        list.add(note);
        list.add(note);
        list.add(note);
        list.add(note);
    }

    public static Note getNote(int index){
        return list.get(index);
    }

    public static int getLength(){
        return list.size();
    }

    public static void setFileStorage(FileStorage fs) {
        fileStorage = fs;
    }
    public static void saveNotesToFile() {
        fileStorage.saveToFile(list, fileName);
    }
    public static void readNotesToFile() {
        Object object = fileStorage.readObject(fileName);
//        fileStorage.saveToFile(list, fileName);
        if(object != null) {
            list = (ArrayList<Note>) object;
        }
    }
}
