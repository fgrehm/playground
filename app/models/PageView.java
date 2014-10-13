/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity 
public class PageView extends Model {

  @Id
  @Constraints.Min(10)
  public Long id;
  
  @Formats.DateTime(pattern="dd/MM/yyyy")
  public Date date = new Date();
  
  public static Finder<Long,PageView> find = new Finder<Long,PageView>(
    Long.class, PageView.class
  );
}