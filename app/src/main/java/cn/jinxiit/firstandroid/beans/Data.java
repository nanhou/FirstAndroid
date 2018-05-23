package cn.jinxiit.firstandroid.beans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Data
{

    private String avatar;
    private String nickname;
    private String createTime;
    private String content;
    private List<String> pictureList;
    private List<String> pictureThumbList;

    public static List<Data> get() {
        List<Data> dataList = new ArrayList<>();

        Data data1 = new Data();
        data1.avatar = "http://b162.photo.store.qq.com/psb?/V14EhGon4cZvmh/z2WukT5EhNE76WtOcbqPIgwM2Wxz4Tb7Nub.rDpsDgo!/b/dOaanmAaKQAA";
        data1.nickname = "萌新-lpe";
        data1.createTime = "昨天 11:21";
        data1.content = "开司还是那么帅";
//        data1.pictureList = Arrays.asList(
//                "http://img.my.csdn.net/uploads/201701/06/1483664940_9893.jpg",
//                "http://img.my.csdn.net/uploads/201701/06/1483664940_3308.jpg",
//                "http://img.my.csdn.net/uploads/201701/06/1483664927_3920.png",
//                "http://img.my.csdn.net/uploads/201701/06/1483664926_8360.png",
//                "http://img.my.csdn.net/uploads/201701/06/1483664926_6184.png",
//                "http://img.my.csdn.net/uploads/201701/06/1483664925_8382.png",
//                "http://img.my.csdn.net/uploads/201701/06/1483664925_2087.jpg",
//                "http://img.my.csdn.net/uploads/201701/06/1483664777_5730.png",
//                "http://img.my.csdn.net/uploads/201701/06/1483664741_1378.jpg",
//                "http://img.my.csdn.net/uploads/201701/06/1483671689_9534.png",
//                "http://img.my.csdn.net/uploads/201701/06/1483671689_2126.png",
//                "http://img.my.csdn.net/uploads/201701/06/1483671703_7890.png",
//                "http://img.my.csdn.net/uploads/201707/27/1501118577_9169.jpg" // 超出屏幕宽度大尺寸图测试
//        );
        data1.pictureList = Arrays.asList(
                "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1526234146260&di=5929e629fd428ebe83b4961fa509b7f0&imgtype=0&src=http%3A%2F%2Fimg1.ali213.net%2Fpicfile%2FNews%2F2015%2F02%2F08%2F584_2015020823726840.jpg",
                "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1526233976138&di=546c171d24e1529e38157db586256cc5&imgtype=0&src=http%3A%2F%2Fn.sinaimg.cn%2Fent%2Ftransform%2F417%2Fw500h717%2F20180509%2FWJcX-haichqy7945535.jpg",
                "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1526234146260&di=b3495cdeeb4c1ecb13fb408ee41bab71&imgtype=0&src=http%3A%2F%2Fy3.ifengimg.com%2Fnews_spider%2Fdci_2012%2F05%2Fa3c3ed62dc5a94ca9a27185800a30e2f.jpg",
                "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1526233976553&di=e5d7d79c5233a74a70e9c4cd18902a5a&imgtype=0&src=http%3A%2F%2Fn.sinaimg.cn%2Fent%2Ftransform%2F744%2Fw630h914%2F20180507%2FGOVR-fzrwiaz4974512.jpg",
                "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1526233976551&di=c1312d15e6a4ab61ccf1d77bad59a0d9&imgtype=0&src=http%3A%2F%2Fqimg.hxnews.com%2F2018%2F0424%2F1524552375782.jpg",
                "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1526233976549&di=a3e282c0f298969b105c0a0c0e4dff0d&imgtype=0&src=http%3A%2F%2F5b0988e595225.cdn.sohucs.com%2Fimages%2F20171203%2F4bf7cf7131be4e20a38c116bb2229e24.jpeg",
                "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1526234146260&di=48d47d6421f72d8dfa5debc925df4db9&imgtype=0&src=http%3A%2F%2Fimg.news.d.cn%2FUE%2Fnet%2FUEUpload%2F6356600319142475006654246.jpg",
                "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1526234146260&di=7bbe4b7a1dfa39d39b87f1538e6ac3bb&imgtype=0&src=http%3A%2F%2Fent.sina.com.cn%2Fn.sinaimg.cn%2Fent%2Ftransform%2F150%2Fw630h1120%2F20180512%2FC-6E-hamfahw7176020.jpg",
                "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1526234146266&di=08bb272a4fcab11311351cb6c5f9b3ba&imgtype=0&src=http%3A%2F%2Fphotocdn.sohu.com%2F20150211%2Fmp2095866_1423629247579_1_th.jpeg"
        );

        data1.pictureThumbList = Arrays.asList(
                "http://img.my.csdn.net/uploads/201701/17/1484647899_2806.jpg",
                "http://img.my.csdn.net/uploads/201701/17/1484647798_4500.jpg",
                "http://img.my.csdn.net/uploads/201701/17/1484647897_1367.png",
                "http://img.my.csdn.net/uploads/201701/17/1484650736_2101.png",
                "http://img.my.csdn.net/uploads/201701/17/1484647701_9893.png",
                "http://img.my.csdn.net/uploads/201701/17/1484650700_2514.png",
                "http://img.my.csdn.net/uploads/201701/17/1484647930_5139.jpg",
                "http://img.my.csdn.net/uploads/201701/17/1484647929_8108.png",
                "http://img.my.csdn.net/uploads/201701/17/1484647897_1978.jpg",
                "http://img.my.csdn.net/uploads/201701/17/1484647898_4474.png",
                "http://img.my.csdn.net/uploads/201701/17/1484647930_7735.png",
                "http://img.my.csdn.net/uploads/201701/17/1484647929_9591.png",
                "http://img.my.csdn.net/uploads/201707/27/1501118720_9504.jpg" // 超出屏幕宽度大尺寸图测试
        );


        Data data2 = new Data();
        data2.avatar = "http://b167.photo.store.qq.com/psb?/V14EhGon2OmAUI/hQN450lNoDPF.dO82PVKEdFw0Qj5qyGeyN9fByKgWd0!/m/dJWKmWNZEwAAnull";
        data2.nickname = "苦涩";
        data2.createTime = "昨天 09:59";
        data2.content = "唐僧还是厉害啊。为什么？有宝马";
        data2.pictureList = Arrays.asList(
                "http://img.my.csdn.net/uploads/201701/06/1483664741_7475.png"
        );
        data2.pictureThumbList = Arrays.asList(
                "http://img.my.csdn.net/uploads/201701/17/1484647799_1689.png"
        );

        Data data3 = new Data();
        data3.avatar = "http://b167.photo.store.qq.com/psb?/V14EhGon2OmAUI/hQN450lNoDPF.dO82PVKEdFw0Qj5qyGeyN9fByKgWd0!/m/dJWKmWNZEwAAnull";
        data3.nickname = "empty";
        data3.createTime = "昨天 08:12";
        data3.content = "各种眼神";
        data3.pictureList = Arrays.asList(
                "http://img.my.csdn.net/uploads/201701/06/1483671690_1970.png",
                "http://img.my.csdn.net/uploads/201701/06/1483671690_6902.png",
                "http://img.my.csdn.net/uploads/201701/06/1483671702_6499.png",
                "http://img.my.csdn.net/uploads/201701/06/1483671702_2352.jpg"
        );
        data3.pictureThumbList = Arrays.asList(
                "http://img.my.csdn.net/uploads/201701/17/1484650701_4150.png",
                "http://img.my.csdn.net/uploads/201701/17/1484650719_9275.png",
                "http://img.my.csdn.net/uploads/201701/17/1484647702_8420.png",
                "http://img.my.csdn.net/uploads/201701/17/1484647930_4474.jpg"
        );

        Data data4 = new Data();
        data4.avatar = "http://b167.photo.store.qq.com/psb?/V14EhGon2OmAUI/hQN450lNoDPF.dO82PVKEdFw0Qj5qyGeyN9fByKgWd0!/m/dJWKmWNZEwAAnull";
        data4.nickname = "empty";
        data4.createTime = "昨天 06:00";
        data4.content = "人与人间的信任，就像是纸片，一旦破损，就不会再回到原来的样子。";
        data4.pictureList = Arrays.asList(
                "http://img.my.csdn.net/uploads/201701/13/1484296303_7395.png",
                "http://img.my.csdn.net/uploads/201701/13/1484296122_9613.jpg",
                "http://img.my.csdn.net/uploads/201701/13/1484296303_6984.png"
        );
        data4.pictureThumbList = Arrays.asList(
                "http://img.my.csdn.net/uploads/201701/17/1484647817_3557.png",
                "http://img.my.csdn.net/uploads/201701/17/1484647818_9583.jpg",
                "http://img.my.csdn.net/uploads/201701/17/1484647817_7305.png"
        );

        Data data5 = new Data();
        data5.avatar = "http://qlogo3.store.qq.com/qzone/383559698/383559698/100?1416542262";
        data5.nickname = "越线龙马";
        data5.createTime = "前天 14:61";
        data5.content = "雪.触之即化..愿永久飘零";
        data5.pictureList = Arrays.asList(
                "http://img.my.csdn.net/uploads/201701/13/1484296288_3031.png",
                "http://img.my.csdn.net/uploads/201701/13/1484296303_5044.jpg"
        );
        data5.pictureThumbList = Arrays.asList(
                "http://img.my.csdn.net/uploads/201701/17/1484647278_8869.png",
                "http://img.my.csdn.net/uploads/201701/17/1484647702_1117.jpg"
        );

        Data data6 = new Data();
        data6.avatar = "http://b162.photo.store.qq.com/psb?/V14EhGon4cZvmh/z2WukT5EhNE76WtOcbqPIgwM2Wxz4Tb7Nub.rDpsDgo!/b/dOaanmAaKQAA";
        data6.nickname = "顺子要不起";
        data6.createTime = "圣诞节";
        data6.content = "颜宇扬的期末总结\n1、有本事冲我来，别再家长会上吓唬我爸\n2、期末考试成绩出来了，我觉得我妈生二胎是非常明智的选择\n3、这场考试对于我的意义就是知道了班上到底有多少人\n4、期末考试不给老师们露一手，他们还真以为自己教的好";
        data6.pictureList = Arrays.asList(
                "http://img.my.csdn.net/uploads/201701/13/1484296287_2190.png",
                "http://img.my.csdn.net/uploads/201701/13/1484296286_7908.png",
                "http://img.my.csdn.net/uploads/201701/13/1484296286_7013.png",
                "http://img.my.csdn.net/uploads/201701/13/1484296286_6401.jpg",
                "http://img.my.csdn.net/uploads/201701/13/1484296106_5671.png"
        );
        data6.pictureThumbList = Arrays.asList(
                "http://img.my.csdn.net/uploads/201701/17/1484647898_9300.png",
                "http://img.my.csdn.net/uploads/201701/17/1484647278_2143.png",
                "http://img.my.csdn.net/uploads/201701/17/1484647816_4929.png",
                "http://img.my.csdn.net/uploads/201701/17/1484647817_5319.jpg",
                "http://img.my.csdn.net/uploads/201701/17/1484647818_3369.png"
        );

        dataList.add(data1);
        dataList.add(data2);
        dataList.add(data3);
        dataList.add(data4);
        dataList.add(data5);
        dataList.add(data6);
        return dataList;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<String> getPictureList() {
        return pictureList;
    }

    public void setPictureList(List<String> pictureList) {
        this.pictureList = pictureList;
    }

    public List<String> getPictureThumbList() {
        return pictureThumbList;
    }

    public void setPictureThumbList(List<String> pictureThumbList) {
        this.pictureThumbList = pictureThumbList;
    }
}
