package com.clapinig.bayareacovidtracker.server.models;

public class Properties {
  private Integer id;
  private Integer point_count;
  private Integer point_count_abbreviated;

  public Properties() {}

  public Properties(Integer id, Integer point_count) {
    this.id = id;
    this.point_count = point_count;
    this.point_count_abbreviated = point_count;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getPoint_count() {
    return point_count;
  }

  public void setPoint_count(Integer point_count) {
    this.point_count = point_count;
  }

  public Integer getPoint_count_abbreviated() {
    return point_count_abbreviated;
  }

  public void setPoint_count_abbreviated(Integer point_count_abbreviated) {
    this.point_count_abbreviated = point_count_abbreviated;
  }
}
