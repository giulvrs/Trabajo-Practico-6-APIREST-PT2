package com.example.inicial1.entities.audit;



import jakarta.persistence.*;
import lombok.*;
import org.example.config.CustomRevisionListener;
import org.hibernate.envers.RevisionEntity;
import org.hibernate.envers.RevisionNumber;
import org.hibernate.envers.RevisionTimestamp;


import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "REVISION_INFO")
@RevisionEntity(CustomRevisionListener.class)
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Data
public class Revision implements Serializable {
    private static final long serialVersionID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "revision_seq")
    @SequenceGenerator(name="revison_seq",sequenceName="rbac.seq_revison_id")
    @RevisionNumber
    private int id;

    @Column(name = "REVISION_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    @RevisionTimestamp
    private Date date;

}

