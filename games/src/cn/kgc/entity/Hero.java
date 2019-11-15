package cn.kgc.entity;


public class Hero {

  private int id;
  private String heroName;
  private String heroRole;
  private float vitality;
  private float powerValue;
  private float mana;
  private int userId;

  public Hero() {
  }

  public Hero(int id, String heroName, String heroRole, float vitality, float powerValue, float mana, int userId) {
    this.id = id;
    this.heroName = heroName;
    this.heroRole = heroRole;
    this.vitality = vitality;
    this.powerValue = powerValue;
    this.mana = mana;
    this.userId = userId;
  }

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getHeroName() {
    return heroName;
  }

  public void setHeroName(String heroName) {
    this.heroName = heroName;
  }

  public String getHeroRole() {
    return heroRole;
  }

  public void setHeroRole(String heroRole) {
    this.heroRole = heroRole;
  }

  public float getVitality() {
    return vitality;
  }

  public void setVitality(float vitality) {
    this.vitality = vitality;
  }

  public float getPowerValue() {
    return powerValue;
  }

  public void setPowerValue(float powerValue) {
    this.powerValue = powerValue;
  }

  public float getMana() {
    return mana;
  }

  public void setMana(float mana) {
    this.mana = mana;
  }
}
