package org.shiftworksboot.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "schedule")
@Getter @Setter @ToString
public class Schedule extends BaseEntity{

    @Id
    @Column(name = "sch_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer schId;

    // Booking 관련 기능 merge 후 추가
    //@OneToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "book_id")
    //private Booking booking;

    @Column(name = "sch_title")
    private String schTitle;

    @Column(name = "sch_content")
    private String schContent;

    @Column(name = "start_date")
    private String startDate;

    @Column(name = "end_date")
    private String endDate;

    @Column(name = "sch_group")
    private String schGroup;

}
