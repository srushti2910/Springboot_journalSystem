package com.example.demo.entity;

//import lombok.*;
////import net.engineeringdigest.journalApp.enums.Sentiment;
//import org.bson.types.ObjectId;
//import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.DBRef;
//import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.lang.NonNull;

import java.time.LocalDateTime;
import java.util.Date;

//@Document(collection = "journal_entries")
//@Data
//@NoArgsConstructor
@Document(collection = "journal_entries")
@Data
@NoArgsConstructor
public class JournalEntry {

    @Id
    private ObjectId id;

    @NonNull
    private String title;

    private String content;

    private LocalDateTime date;

}