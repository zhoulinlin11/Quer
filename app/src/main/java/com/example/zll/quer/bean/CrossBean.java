package com.example.zll.quer.bean;

import java.util.List;

/**
 * Created by zll on 2018/7/17.
 */

public class CrossBean {

    /**
     * msg : 获取段子列表成功
     * code : 0
     * data : [{"commentNum":null,"content":"中华社会生活还是生活还是说","createTime":"2018-07-17T17:43:35","imgUrls":null,"jid":3363,"praiseNum":null,"shareNum":null,"uid":15014,"user":{"age":null,"fans":"null","follow":false,"icon":null,"nickname":null,"praiseNum":"null"}},{"commentNum":null,"content":"哈哈哈","createTime":"2018-07-17T17:36:58","imgUrls":null,"jid":3362,"praiseNum":null,"shareNum":null,"uid":15026,"user":{"age":null,"fans":"null","follow":false,"icon":null,"nickname":null,"praiseNum":"null"}},{"commentNum":null,"content":"张少华是大傻逼,大伙没意见吧!!!","createTime":"2018-07-17T17:36:52","imgUrls":null,"jid":3361,"praiseNum":null,"shareNum":null,"uid":12956,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/15318202123041.jpg","nickname":"凡哥哥","praiseNum":"null"}},{"commentNum":null,"content":"哎呦，厉害咯","createTime":"2018-07-17T17:36:22","imgUrls":null,"jid":3360,"praiseNum":null,"shareNum":null,"uid":15026,"user":{"age":null,"fans":"null","follow":false,"icon":null,"nickname":null,"praiseNum":"null"}},{"commentNum":null,"content":"。。。","createTime":"2018-07-17T17:35:47","imgUrls":null,"jid":3359,"praiseNum":null,"shareNum":null,"uid":15026,"user":{"age":null,"fans":"null","follow":false,"icon":null,"nickname":null,"praiseNum":"null"}},{"commentNum":null,"content":"张少华是大傻逼,大伙没意见吧!!!","createTime":"2018-07-17T17:30:59","imgUrls":null,"jid":3358,"praiseNum":null,"shareNum":null,"uid":12956,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/15318202123041.jpg","nickname":"凡哥哥","praiseNum":"null"}},{"commentNum":null,"content":"张少华是大傻逼,大伙没意见吧!!!","createTime":"2018-07-17T17:29:15","imgUrls":null,"jid":3357,"praiseNum":null,"shareNum":null,"uid":12956,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/15318202123041.jpg","nickname":"凡哥哥","praiseNum":"null"}},{"commentNum":null,"content":"张少华是大傻逼,大伙没意见吧!!!","createTime":"2018-07-17T17:22:58","imgUrls":null,"jid":3356,"praiseNum":null,"shareNum":null,"uid":12956,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/15318202123041.jpg","nickname":"凡哥哥","praiseNum":"null"}},{"commentNum":null,"content":"师太和贫僧牵手了！","createTime":"2018-07-17T17:18:11","imgUrls":null,"jid":3355,"praiseNum":null,"shareNum":null,"uid":16545,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1531813761867monkey.png","nickname":"hhy","praiseNum":"null"}},{"commentNum":null,"content":"有位非常漂亮的女同事，有天起晚了没有时间化妆便急忙冲到公司。结果那天她被记旷工了","createTime":"2018-07-17T17:17:30","imgUrls":null,"jid":3354,"praiseNum":null,"shareNum":null,"uid":16545,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1531813761867monkey.png","nickname":"hhy","praiseNum":"null"}}]
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
         * commentNum : null
         * content : 中华社会生活还是生活还是说
         * createTime : 2018-07-17T17:43:35
         * imgUrls : null
         * jid : 3363
         * praiseNum : null
         * shareNum : null
         * uid : 15014
         * user : {"age":null,"fans":"null","follow":false,"icon":null,"nickname":null,"praiseNum":"null"}
         */

        private Object commentNum;
        private String content;
        private String createTime;
        private Object imgUrls;
        private int jid;
        private Object praiseNum;
        private Object shareNum;
        private int uid;
        private UserBean user;

        public Object getCommentNum() {
            return commentNum;
        }

        public void setCommentNum(Object commentNum) {
            this.commentNum = commentNum;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public Object getImgUrls() {
            return imgUrls;
        }

        public void setImgUrls(Object imgUrls) {
            this.imgUrls = imgUrls;
        }

        public int getJid() {
            return jid;
        }

        public void setJid(int jid) {
            this.jid = jid;
        }

        public Object getPraiseNum() {
            return praiseNum;
        }

        public void setPraiseNum(Object praiseNum) {
            this.praiseNum = praiseNum;
        }

        public Object getShareNum() {
            return shareNum;
        }

        public void setShareNum(Object shareNum) {
            this.shareNum = shareNum;
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

        public static class UserBean {
            /**
             * age : null
             * fans : null
             * follow : false
             * icon : null
             * nickname : null
             * praiseNum : null
             */

            private Object age;
            private String fans;
            private boolean follow;
            private Object icon;
            private Object nickname;
            private String praiseNum;

            public Object getAge() {
                return age;
            }

            public void setAge(Object age) {
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

            public Object getIcon() {
                return icon;
            }

            public void setIcon(Object icon) {
                this.icon = icon;
            }

            public Object getNickname() {
                return nickname;
            }

            public void setNickname(Object nickname) {
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
