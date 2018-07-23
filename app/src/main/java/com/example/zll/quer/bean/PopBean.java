package com.example.zll.quer.bean;

import java.util.List;

/**
 * Created by zll on 2018/7/19.
 */

public class PopBean {
    /**
     * msg : 获取作品列表成功
     * code : 0
     * data : [{"commentNum":0,"comments":[],"cover":"https://www.zhaoapi.cn/images/quarter/15319014381641.jpg","createTime":"2018-07-18T16:10:38","favoriteNum":0,"latitude":"40.0413492710","localUri":null,"longitude":"116.2987911701","playNum":0,"praiseNum":0,"uid":12956,"user":{"age":"13","fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/15319014281011.jpg","nickname":"凡哥哥","praiseNum":"null"},"videoUrl":"https://www.zhaoapi.cn/images/quarter/15319014381647.18.wmv","wid":658,"workDesc":"??"},{"commentNum":0,"comments":[],"cover":"https://www.zhaoapi.cn/images/quarter/15319013231321.jpg","createTime":"2018-07-18T16:08:43","favoriteNum":0,"latitude":"40.0413492710","localUri":null,"longitude":"116.2987911701","playNum":0,"praiseNum":0,"uid":12956,"user":{"age":"13","fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/15319014281011.jpg","nickname":"凡哥哥","praiseNum":"null"},"videoUrl":"https://www.zhaoapi.cn/images/quarter/15319013231327.18.wmv","wid":657,"workDesc":"??"},{"commentNum":0,"comments":[],"cover":"https://www.zhaoapi.cn/images/quarter/15318978133351.jpg","createTime":"2018-07-18T15:10:13","favoriteNum":0,"latitude":"40.0413492710","localUri":null,"longitude":"116.2987911701","playNum":0,"praiseNum":0,"uid":12956,"user":{"age":"13","fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/15319014281011.jpg","nickname":"凡哥哥","praiseNum":"null"},"videoUrl":"https://www.zhaoapi.cn/images/quarter/15318978133357.18.wmv","wid":656,"workDesc":null},{"commentNum":0,"comments":[],"cover":"https://www.zhaoapi.cn/images/quarter/15318976908201.jpg","createTime":"2018-07-18T15:08:10","favoriteNum":0,"latitude":"40.0413492710","localUri":null,"longitude":"116.2987911701","playNum":0,"praiseNum":0,"uid":12956,"user":{"age":"13","fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/15319014281011.jpg","nickname":"凡哥哥","praiseNum":"null"},"videoUrl":"https://www.zhaoapi.cn/images/quarter/15318976908207.18.wmv","wid":655,"workDesc":null},{"commentNum":0,"comments":[],"cover":"https://www.zhaoapi.cn/images/quarter/15318976561481.jpg","createTime":"2018-07-18T15:07:36","favoriteNum":0,"latitude":"40.0413492710","localUri":null,"longitude":"116.2987911701","playNum":0,"praiseNum":0,"uid":12956,"user":{"age":"13","fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/15319014281011.jpg","nickname":"凡哥哥","praiseNum":"null"},"videoUrl":"https://www.zhaoapi.cn/images/quarter/15318976561487.18.wmv","wid":654,"workDesc":null},{"commentNum":0,"comments":[],"cover":"https://www.zhaoapi.cn/images/quarter/15318974658201.jpg","createTime":"2018-07-18T15:04:25","favoriteNum":1,"latitude":"40.0413492710","localUri":null,"longitude":"116.2987911701","playNum":0,"praiseNum":0,"uid":12956,"user":{"age":"13","fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/15319014281011.jpg","nickname":"凡哥哥","praiseNum":"null"},"videoUrl":"https://www.zhaoapi.cn/images/quarter/15318974658207.18.wmv","wid":653,"workDesc":null},{"commentNum":0,"comments":[],"cover":"https://www.zhaoapi.cn/images/quarter/15318973168981.jpg","createTime":"2018-07-18T15:01:56","favoriteNum":0,"latitude":"40.0413492710","localUri":null,"longitude":"116.2987911701","playNum":0,"praiseNum":0,"uid":12956,"user":{"age":"13","fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/15319014281011.jpg","nickname":"凡哥哥","praiseNum":"null"},"videoUrl":"https://www.zhaoapi.cn/images/quarter/15318973168987.18.wmv","wid":652,"workDesc":null},{"commentNum":0,"comments":[],"cover":"https://www.zhaoapi.cn/images/quarter/15318971657421.jpg","createTime":"2018-07-18T14:59:25","favoriteNum":0,"latitude":"40.0413492710","localUri":null,"longitude":"116.2987911701","playNum":0,"praiseNum":0,"uid":12956,"user":{"age":"13","fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/15319014281011.jpg","nickname":"凡哥哥","praiseNum":"null"},"videoUrl":"https://www.zhaoapi.cn/images/quarter/15318971657427.18.wmv","wid":651,"workDesc":null},{"commentNum":0,"comments":[],"cover":"https://www.zhaoapi.cn/images/quarter/15318970072571.jpg","createTime":"2018-07-18T14:56:47","favoriteNum":0,"latitude":"40.0413492710","localUri":null,"longitude":"116.2987911701","playNum":0,"praiseNum":0,"uid":12956,"user":{"age":"13","fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/15319014281011.jpg","nickname":"凡哥哥","praiseNum":"null"},"videoUrl":"https://www.zhaoapi.cn/images/quarter/15318970072577.18.wmv","wid":650,"workDesc":null},{"commentNum":0,"comments":[],"cover":"https://www.zhaoapi.cn/images/quarter/15318969867891.jpg","createTime":"2018-07-18T14:56:26","favoriteNum":0,"latitude":"40.0413492710","localUri":null,"longitude":"116.2987911701","playNum":0,"praiseNum":0,"uid":12956,"user":{"age":"13","fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/15319014281011.jpg","nickname":"凡哥哥","praiseNum":"null"},"videoUrl":"https://www.zhaoapi.cn/images/quarter/15318969867897.18.wmv","wid":649,"workDesc":null}]
     */

    private String msg;
    private String code;
    private List<DataBean> data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * commentNum : 0
         * comments : []
         * cover : https://www.zhaoapi.cn/images/quarter/15319014381641.jpg
         * createTime : 2018-07-18T16:10:38
         * favoriteNum : 0
         * latitude : 40.0413492710
         * localUri : null
         * longitude : 116.2987911701
         * playNum : 0
         * praiseNum : 0
         * uid : 12956
         * user : {"age":"13","fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/15319014281011.jpg","nickname":"凡哥哥","praiseNum":"null"}
         * videoUrl : https://www.zhaoapi.cn/images/quarter/15319014381647.18.wmv
         * wid : 658
         * workDesc : ??
         */

        private int commentNum;
        private String cover;
        private String createTime;
        private int favoriteNum;
        private String latitude;
        private Object localUri;
        private String longitude;
        private int playNum;
        private int praiseNum;
        private int uid;
        private UserBean user;
        private String videoUrl;
        private int wid;
        private String workDesc;
        private List<?> comments;

        public int getCommentNum() {
            return commentNum;
        }

        public void setCommentNum(int commentNum) {
            this.commentNum = commentNum;
        }

        public String getCover() {
            return cover;
        }

        public void setCover(String cover) {
            this.cover = cover;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public int getFavoriteNum() {
            return favoriteNum;
        }

        public void setFavoriteNum(int favoriteNum) {
            this.favoriteNum = favoriteNum;
        }

        public String getLatitude() {
            return latitude;
        }

        public void setLatitude(String latitude) {
            this.latitude = latitude;
        }

        public Object getLocalUri() {
            return localUri;
        }

        public void setLocalUri(Object localUri) {
            this.localUri = localUri;
        }

        public String getLongitude() {
            return longitude;
        }

        public void setLongitude(String longitude) {
            this.longitude = longitude;
        }

        public int getPlayNum() {
            return playNum;
        }

        public void setPlayNum(int playNum) {
            this.playNum = playNum;
        }

        public int getPraiseNum() {
            return praiseNum;
        }

        public void setPraiseNum(int praiseNum) {
            this.praiseNum = praiseNum;
        }

        public int getUid() {
            return uid;
        }

        public void setUid(int uid) {
            this.uid = uid;
        }

        public UserBean getUser() {
            return user;
        }

        public void setUser(UserBean user) {
            this.user = user;
        }

        public String getVideoUrl() {
            return videoUrl;
        }

        public void setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
        }

        public int getWid() {
            return wid;
        }

        public void setWid(int wid) {
            this.wid = wid;
        }

        public String getWorkDesc() {
            return workDesc;
        }

        public void setWorkDesc(String workDesc) {
            this.workDesc = workDesc;
        }

        public List<?> getComments() {
            return comments;
        }

        public void setComments(List<?> comments) {
            this.comments = comments;
        }

        public static class UserBean {
            /**
             * age : 13
             * fans : null
             * follow : false
             * icon : https://www.zhaoapi.cn/images/15319014281011.jpg
             * nickname : 凡哥哥
             * praiseNum : null
             */

            private String age;
            private String fans;
            private boolean follow;
            private String icon;
            private String nickname;
            private String praiseNum;

            public String getAge() {
                return age;
            }

            public void setAge(String age) {
                this.age = age;
            }

            public String getFans() {
                return fans;
            }

            public void setFans(String fans) {
                this.fans = fans;
            }

            public boolean isFollow() {
                return follow;
            }

            public void setFollow(boolean follow) {
                this.follow = follow;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public String getPraiseNum() {
                return praiseNum;
            }

            public void setPraiseNum(String praiseNum) {
                this.praiseNum = praiseNum;
            }
        }
    }
}
