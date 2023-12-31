package com.example.mercadodealimentosjava.helper;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

//Padrão de Criação: Singleton
//Serve para garantir que uma classe tenha apenas uma única instância e oferecer um ponto global de acesso para a mesma, de modo a garantir que cada usuário seja único,
//assim a mesma instância, por ser única (no caso, cada usuário) é usado em todo o aplicativo
//Esta padrão (Singleton) possui os métodos estáticos: (getFirebase(), getFirebaseAutentucacao() e getFirebaseStorage()), com os quais
//retornam instâncias únicas das classes DatabaseReference, FirebaseAuth, e StorageReference, respectivamente.


public class ConfiguracaoFirebase {

    private static DatabaseReference referenciaFirebase;
    private static FirebaseAuth referenciaAutenticacao;
    private static StorageReference referenciaStorage;


    //retorna a referencia do database
    //Retorna a referência do banco de dados Firebase
    //getFirebase(): Retorna a instância única de DatabaseReference. Se ainda não foi inicializado, ele cria uma nova instância usando FirebaseDatabase.getInstance().getReference().
    public static DatabaseReference getFirebase(){
        if( referenciaFirebase == null ){
            referenciaFirebase = FirebaseDatabase.getInstance().getReference();
        }
        return referenciaFirebase;
    }

    //retorna a instância do FirebaseAuth
    //getFirebaseAutentucacao(): Retorna a instância única de FirebaseAuth. Se ainda não foi inicializado, ele cria uma nova instância usando FirebaseAuth.getInstance().
    public static FirebaseAuth getFirebaseAutentucacao(){
        if( referenciaAutenticacao == null ){
            referenciaAutenticacao = FirebaseAuth.getInstance();
        }
        return referenciaAutenticacao;
    }

    //retorna a instancia do FirebaseStorage
    //getFirebaseStorage(): Retorna a instância única de StorageReference. Se ainda não foi inicializado, ele cria uma nova instância usando FirebaseStorage.getInstance().getReference().
    public static StorageReference getFirebaseStorage(){
        if( referenciaStorage == null ){
            referenciaStorage = FirebaseStorage.getInstance().getReference();
        }
        return referenciaStorage;
    }
}
