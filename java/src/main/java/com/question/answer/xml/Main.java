package com.question.answer.xml;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException, JAXBException {

        File file = new File("src/main/resources/items.xml");
        Scanner scan = new Scanner(System.in);

        JAXBContext context = JAXBContext.newInstance(Items.class);
        Unmarshaller un = context.createUnmarshaller();
        Items itemData = (Items) un.unmarshal(file);

        List<Item> items = itemData.getItem();

        System.out.println("'\n\n------------- Options ---------------");
        System.out.println("\n1. Search Items by Group");
        System.out.println("\n2. Modify Movie");
        int choice = scan.nextInt();
        scan.nextLine();

        if (choice == 2){
            System.out.println("\nEnter the name of the movie you would like to modify: ");
            String search = scan.nextLine();

            Optional<Item> item = items.stream()
                    .map(x->{
                        if(x.getItems()==null){
                            return Collections.singletonList(x);
                        }
                        x.getItems().getItem().add(x);
                        return x.getItems().getItem();
                    })
                    .flatMap(Collection::stream)
                    .filter(x -> x.getName().equals(search))
                    .peek(x-> x.setItems(null))//Peek exists mainly to support debugging
                    .findFirst();
            System.out.println(item);

        }

        else{
            System.out.println("You entered an invalid option!");
        }
    }
}