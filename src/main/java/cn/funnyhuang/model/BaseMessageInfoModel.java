package cn.funnyhuang.model;


import java.util.Date;

public class BaseMessageInfoModel {
    private final Long id;
    private final String message;
    private final Date time;
    //纬度
    private Double latitude;
    //经度
    private Double longitude;


    /**构造器
     *
     */
    public BaseMessageInfoModel(String message, Date time) {
        this(null, message, time, 0.0, 0.0);
    }

    /**构造器
     *
     * @param id
     * @param message
     * @param time
     * @param latitude
     * @param longitude
     */
    public BaseMessageInfoModel(Long id, String message, Date time, Double latitude, Double longitude) {
        this.id = id;
        this.message = message;
        this.time = time;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public Date getTime() {
        return time;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
