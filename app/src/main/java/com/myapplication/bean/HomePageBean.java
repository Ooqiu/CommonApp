package com.myapplication.bean;

import java.util.List;

/**
 *  author：PengHongQiu
 * data: 2017/1/11 10:17
 *  e-mail：18330470538@163.com
 *  
 */
public class HomePageBean {
    private boolean success;
    private Object message;
    private DataBean data;
    private Object errorData;
    private Object list;
    private Object pageInfo;
    private Object datasets;
    private Object datasetLists;
    private DataOptionalBean dataOptional;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public Object getErrorData() {
        return errorData;
    }

    public void setErrorData(Object errorData) {
        this.errorData = errorData;
    }

    public Object getList() {
        return list;
    }

    public void setList(Object list) {
        this.list = list;
    }

    public Object getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(Object pageInfo) {
        this.pageInfo = pageInfo;
    }

    public Object getDatasets() {
        return datasets;
    }

    public void setDatasets(Object datasets) {
        this.datasets = datasets;
    }

    public Object getDatasetLists() {
        return datasetLists;
    }

    public void setDatasetLists(Object datasetLists) {
        this.datasetLists = datasetLists;
    }

    public DataOptionalBean getDataOptional() {
        return dataOptional;
    }

    public void setDataOptional(DataOptionalBean dataOptional) {
        this.dataOptional = dataOptional;
    }

    public static class DataBean {

        private PlaceListBean placeList;
        private List<TopImgeListBean> topImgeList;
        private List<NewsImageListBean> newsImageList;
        private List<ProductListBean> productList;
        private List<CategoryImageVoListBean> categoryImageVoList;
        private List<BrandImageListBean> brandImageList;
        private List<SubjectImageListBean> subjectImageList;
        private List<ButtomProductListBean> buttomProductList;
        private List<AreaListBean> areaList;
        private String appVersionCode;
        private String appVersionName;
        private String appVersionContent;

        public String getAppVersionName() {
            return appVersionName;
        }

        public void setAppVersionName(String appVersionName) {
            this.appVersionName = appVersionName;
        }

        public String getAppVersionContent() {
            return appVersionContent;
        }

        public void setAppVersionContent(String appVersionContent) {
            this.appVersionContent = appVersionContent;
        }

        public String getAppVersionCode() {
            return appVersionCode;
        }

        public void setAppVersionCode(String appVersionCode) {
            this.appVersionCode = appVersionCode;
        }

        public PlaceListBean getPlaceList() {
            return placeList;
        }

        public void setPlaceList(PlaceListBean placeList) {
            this.placeList = placeList;
        }

        public List<TopImgeListBean> getTopImgeList() {
            return topImgeList;
        }

        public void setTopImgeList(List<TopImgeListBean> topImgeList) {
            this.topImgeList = topImgeList;
        }

        public List<NewsImageListBean> getNewsImageList() {
            return newsImageList;
        }

        public void setNewsImageList(List<NewsImageListBean> newsImageList) {
            this.newsImageList = newsImageList;
        }

        public List<ProductListBean> getProductList() {
            return productList;
        }

        public void setProductList(List<ProductListBean> productList) {
            this.productList = productList;
        }

        public List<CategoryImageVoListBean> getCategoryImageVoList() {
            return categoryImageVoList;
        }

        public void setCategoryImageVoList(List<CategoryImageVoListBean> categoryImageVoList) {
            this.categoryImageVoList = categoryImageVoList;
        }

        public List<BrandImageListBean> getBrandImageList() {
            return brandImageList;
        }

        public void setBrandImageList(List<BrandImageListBean> brandImageList) {
            this.brandImageList = brandImageList;
        }

        public List<SubjectImageListBean> getSubjectImageList() {
            return subjectImageList;
        }

        public void setSubjectImageList(List<SubjectImageListBean> subjectImageList) {
            this.subjectImageList = subjectImageList;
        }

        public List<ButtomProductListBean> getButtomProductList() {
            return buttomProductList;
        }

        public void setButtomProductList(List<ButtomProductListBean> buttomProductList) {
            this.buttomProductList = buttomProductList;
        }

        public List<AreaListBean> getAreaList() {
            return areaList;
        }

        public void setAreaList(List<AreaListBean> areaList) {
            this.areaList = areaList;
        }

        public static class PlaceListBean {
            private List<PlaceBean> place;

            public List<PlaceBean> getPlace() {
                return place;
            }

            public void setPlace(List<PlaceBean> place) {
                this.place = place;
            }

            public static class PlaceBean {
                /**
                 * title : 333333
                 * twoTitle : 33333333311111111111111@@@2
                 * image : /images/941/JPG-DE653DDF77CF4BB982E31135667321F2-720x1280.jpg
                 * url : http://test.emateglobal.com//active/medical.html
                 */

                private String title;
                private String twoTitle;
                private String image;
                private String url;

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getTwoTitle() {
                    return twoTitle;
                }

                public void setTwoTitle(String twoTitle) {
                    this.twoTitle = twoTitle;
                }

                public String getImage() {
                    return image;
                }

                public void setImage(String image) {
                    this.image = image;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }
            }
        }

        public static class TopImgeListBean {
            /**
             * image : /images/697/JPG-2AD47ACFC3DA4D41B70F44BDD222AE9A-720x1280.jpg
             * url : http://zt.emateglobal.com/fuping/html/fupin-zt/fupinIndex.html
             */

            private String image;
            private String url;

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }

        public static class NewsImageListBean {
            /**
             * image : /images/233/GIF-6224D2ADB3B740548BEB46BEAA7DAB3F-750x320.gif
             * url : http://www.jalk.com
             */

            private String image;
            private String url;

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }

        public static class ProductListBean {
            /**
             * product : {"id":2590,"sellerId":1,"categoryId":64,"typeId":60,"name":"5.5虚拟产品","promotionMessage":"","keyword":"","brandId":12,"self":true,"startTime":1493965379000,"remark":"&lt;p&gt;&lt;br/&gt;&lt;img src=\"http://test.emateglobal.com:8090/shop-image/images/524/JPG-D9C5C913482742468DB3D73251E50FFB-640x480.jpg\" _src=\"http://test.emateglobal.com:8090/shop-image/images/524/JPG-D9C5C913482742468DB3D73251E50FFB-640x480.jpg\"/&gt;&lt;/p&gt;","packageList":"1111","suit":false,"suitRelationProductIds":"","productUsefull":1,"collectiveProduct":true,"collectiveCountLimit":1,"creatorId":1,"virtualProduct":true,"masterImage":"/images/70/JPG-5B1F1936079547E1A1BB523A7C4C2F6E-750x750.jpg","transportTplId":0,"baseWeight":0,"addWeight":0,"supplyId":0,"salesAmount":0,"strictCheck":false,"checking":false,"efenbaoIntegralTransable":false,"huiCoinTransable":false,"fuping":false,"limitNumber":0,"limitStartTime":-2209017600000,"limitEndTime":32535100800000,"createTime":1493965131000,"updateTime":1494259238000,"seq":0,"status":5,"checkRemark":"","statusComm":"上架","productUsefullComm":"出售"}
             * category : {"id":64,"parentId":48,"typeId":60,"path":"","level":3,"name":"洗发","keyword":"洗发","masterImage":"/images/249/JPG-C0614AA754FB473984ABE0A32FDE8301-750x400.jpg","iconImage":"/images/568/JPG-8DF89C0D2C02400F8708A276A56E356F-321x321.jpg","createTime":1475027157000,"updateTime":1482572146000,"seq":0,"status":0,"sellerVisible":true,"memberVisible":true,"statusComm":"新建","levelComm":"三级"}
             * imgPath : ["/images/70/JPG-5B1F1936079547E1A1BB523A7C4C2F6E-750x750.jpg"]
             * minPrice : 0.1
             * maxPrice : 0.1
             * minMallPrice : 20.0
             * maxMallPrice : 20.0
             * allStock : 345
             * goodsSpecVo : null
             */

            private ProductBean product;
            private CategoryBean category;
            private double minPrice;
            private double maxPrice;
            private double minMallPrice;
            private double maxMallPrice;
            private int allStock;
            private Object goodsSpecVo;
            private List<String> imgPath;

            public ProductBean getProduct() {
                return product;
            }

            public void setProduct(ProductBean product) {
                this.product = product;
            }

            public CategoryBean getCategory() {
                return category;
            }

            public void setCategory(CategoryBean category) {
                this.category = category;
            }

            public double getMinPrice() {
                return minPrice;
            }

            public void setMinPrice(double minPrice) {
                this.minPrice = minPrice;
            }

            public double getMaxPrice() {
                return maxPrice;
            }

            public void setMaxPrice(double maxPrice) {
                this.maxPrice = maxPrice;
            }

            public double getMinMallPrice() {
                return minMallPrice;
            }

            public void setMinMallPrice(double minMallPrice) {
                this.minMallPrice = minMallPrice;
            }

            public double getMaxMallPrice() {
                return maxMallPrice;
            }

            public void setMaxMallPrice(double maxMallPrice) {
                this.maxMallPrice = maxMallPrice;
            }

            public int getAllStock() {
                return allStock;
            }

            public void setAllStock(int allStock) {
                this.allStock = allStock;
            }

            public Object getGoodsSpecVo() {
                return goodsSpecVo;
            }

            public void setGoodsSpecVo(Object goodsSpecVo) {
                this.goodsSpecVo = goodsSpecVo;
            }

            public List<String> getImgPath() {
                return imgPath;
            }

            public void setImgPath(List<String> imgPath) {
                this.imgPath = imgPath;
            }

            public static class ProductBean {
                /**
                 * id : 2590
                 * sellerId : 1
                 * categoryId : 64
                 * typeId : 60
                 * name : 5.5虚拟产品
                 * promotionMessage :
                 * keyword :
                 * brandId : 12
                 * self : true
                 * startTime : 1493965379000
                 * remark : &lt;p&gt;&lt;br/&gt;&lt;img src="http://test.emateglobal.com:8090/shop-image/images/524/JPG-D9C5C913482742468DB3D73251E50FFB-640x480.jpg" _src="http://test.emateglobal.com:8090/shop-image/images/524/JPG-D9C5C913482742468DB3D73251E50FFB-640x480.jpg"/&gt;&lt;/p&gt;
                 * packageList : 1111
                 * suit : false
                 * suitRelationProductIds :
                 * productUsefull : 1
                 * collectiveProduct : true
                 * collectiveCountLimit : 1
                 * creatorId : 1
                 * virtualProduct : true
                 * masterImage : /images/70/JPG-5B1F1936079547E1A1BB523A7C4C2F6E-750x750.jpg
                 * transportTplId : 0
                 * baseWeight : 0.0
                 * addWeight : 0.0
                 * supplyId : 0
                 * salesAmount : 0
                 * strictCheck : false
                 * checking : false
                 * efenbaoIntegralTransable : false
                 * huiCoinTransable : false
                 * fuping : false
                 * limitNumber : 0
                 * limitStartTime : -2209017600000
                 * limitEndTime : 32535100800000
                 * createTime : 1493965131000
                 * updateTime : 1494259238000
                 * seq : 0
                 * status : 5
                 * checkRemark :
                 * statusComm : 上架
                 * productUsefullComm : 出售
                 */

                private int id;
                private int sellerId;
                private int categoryId;
                private int typeId;
                private String name;
                private String promotionMessage;
                private String keyword;
                private int brandId;
                private boolean self;
                private long startTime;
                private String remark;
                private String packageList;
                private boolean suit;
                private String suitRelationProductIds;
                private int productUsefull;
                private boolean collectiveProduct;
                private int collectiveCountLimit;
                private int creatorId;
                private boolean virtualProduct;
                private String masterImage;
                private int transportTplId;
                private double baseWeight;
                private double addWeight;
                private int supplyId;
                private int salesAmount;
                private boolean strictCheck;
                private boolean checking;
                private boolean efenbaoIntegralTransable;
                private boolean huiCoinTransable;
                private boolean fuping;
                private int limitNumber;
                private long limitStartTime;
                private long limitEndTime;
                private long createTime;
                private long updateTime;
                private int seq;
                private int status;
                private String checkRemark;
                private String statusComm;
                private String productUsefullComm;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public int getSellerId() {
                    return sellerId;
                }

                public void setSellerId(int sellerId) {
                    this.sellerId = sellerId;
                }

                public int getCategoryId() {
                    return categoryId;
                }

                public void setCategoryId(int categoryId) {
                    this.categoryId = categoryId;
                }

                public int getTypeId() {
                    return typeId;
                }

                public void setTypeId(int typeId) {
                    this.typeId = typeId;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getPromotionMessage() {
                    return promotionMessage;
                }

                public void setPromotionMessage(String promotionMessage) {
                    this.promotionMessage = promotionMessage;
                }

                public String getKeyword() {
                    return keyword;
                }

                public void setKeyword(String keyword) {
                    this.keyword = keyword;
                }

                public int getBrandId() {
                    return brandId;
                }

                public void setBrandId(int brandId) {
                    this.brandId = brandId;
                }

                public boolean isSelf() {
                    return self;
                }

                public void setSelf(boolean self) {
                    this.self = self;
                }

                public long getStartTime() {
                    return startTime;
                }

                public void setStartTime(long startTime) {
                    this.startTime = startTime;
                }

                public String getRemark() {
                    return remark;
                }

                public void setRemark(String remark) {
                    this.remark = remark;
                }

                public String getPackageList() {
                    return packageList;
                }

                public void setPackageList(String packageList) {
                    this.packageList = packageList;
                }

                public boolean isSuit() {
                    return suit;
                }

                public void setSuit(boolean suit) {
                    this.suit = suit;
                }

                public String getSuitRelationProductIds() {
                    return suitRelationProductIds;
                }

                public void setSuitRelationProductIds(String suitRelationProductIds) {
                    this.suitRelationProductIds = suitRelationProductIds;
                }

                public int getProductUsefull() {
                    return productUsefull;
                }

                public void setProductUsefull(int productUsefull) {
                    this.productUsefull = productUsefull;
                }

                public boolean isCollectiveProduct() {
                    return collectiveProduct;
                }

                public void setCollectiveProduct(boolean collectiveProduct) {
                    this.collectiveProduct = collectiveProduct;
                }

                public int getCollectiveCountLimit() {
                    return collectiveCountLimit;
                }

                public void setCollectiveCountLimit(int collectiveCountLimit) {
                    this.collectiveCountLimit = collectiveCountLimit;
                }

                public int getCreatorId() {
                    return creatorId;
                }

                public void setCreatorId(int creatorId) {
                    this.creatorId = creatorId;
                }

                public boolean isVirtualProduct() {
                    return virtualProduct;
                }

                public void setVirtualProduct(boolean virtualProduct) {
                    this.virtualProduct = virtualProduct;
                }

                public String getMasterImage() {
                    return masterImage;
                }

                public void setMasterImage(String masterImage) {
                    this.masterImage = masterImage;
                }

                public int getTransportTplId() {
                    return transportTplId;
                }

                public void setTransportTplId(int transportTplId) {
                    this.transportTplId = transportTplId;
                }

                public double getBaseWeight() {
                    return baseWeight;
                }

                public void setBaseWeight(double baseWeight) {
                    this.baseWeight = baseWeight;
                }

                public double getAddWeight() {
                    return addWeight;
                }

                public void setAddWeight(double addWeight) {
                    this.addWeight = addWeight;
                }

                public int getSupplyId() {
                    return supplyId;
                }

                public void setSupplyId(int supplyId) {
                    this.supplyId = supplyId;
                }

                public int getSalesAmount() {
                    return salesAmount;
                }

                public void setSalesAmount(int salesAmount) {
                    this.salesAmount = salesAmount;
                }

                public boolean isStrictCheck() {
                    return strictCheck;
                }

                public void setStrictCheck(boolean strictCheck) {
                    this.strictCheck = strictCheck;
                }

                public boolean isChecking() {
                    return checking;
                }

                public void setChecking(boolean checking) {
                    this.checking = checking;
                }

                public boolean isEfenbaoIntegralTransable() {
                    return efenbaoIntegralTransable;
                }

                public void setEfenbaoIntegralTransable(boolean efenbaoIntegralTransable) {
                    this.efenbaoIntegralTransable = efenbaoIntegralTransable;
                }

                public boolean isHuiCoinTransable() {
                    return huiCoinTransable;
                }

                public void setHuiCoinTransable(boolean huiCoinTransable) {
                    this.huiCoinTransable = huiCoinTransable;
                }

                public boolean isFuping() {
                    return fuping;
                }

                public void setFuping(boolean fuping) {
                    this.fuping = fuping;
                }

                public int getLimitNumber() {
                    return limitNumber;
                }

                public void setLimitNumber(int limitNumber) {
                    this.limitNumber = limitNumber;
                }

                public long getLimitStartTime() {
                    return limitStartTime;
                }

                public void setLimitStartTime(long limitStartTime) {
                    this.limitStartTime = limitStartTime;
                }

                public long getLimitEndTime() {
                    return limitEndTime;
                }

                public void setLimitEndTime(long limitEndTime) {
                    this.limitEndTime = limitEndTime;
                }

                public long getCreateTime() {
                    return createTime;
                }

                public void setCreateTime(long createTime) {
                    this.createTime = createTime;
                }

                public long getUpdateTime() {
                    return updateTime;
                }

                public void setUpdateTime(long updateTime) {
                    this.updateTime = updateTime;
                }

                public int getSeq() {
                    return seq;
                }

                public void setSeq(int seq) {
                    this.seq = seq;
                }

                public int getStatus() {
                    return status;
                }

                public void setStatus(int status) {
                    this.status = status;
                }

                public String getCheckRemark() {
                    return checkRemark;
                }

                public void setCheckRemark(String checkRemark) {
                    this.checkRemark = checkRemark;
                }

                public String getStatusComm() {
                    return statusComm;
                }

                public void setStatusComm(String statusComm) {
                    this.statusComm = statusComm;
                }

                public String getProductUsefullComm() {
                    return productUsefullComm;
                }

                public void setProductUsefullComm(String productUsefullComm) {
                    this.productUsefullComm = productUsefullComm;
                }
            }

            public static class CategoryBean {
                /**
                 * id : 64
                 * parentId : 48
                 * typeId : 60
                 * path :
                 * level : 3
                 * name : 洗发
                 * keyword : 洗发
                 * masterImage : /images/249/JPG-C0614AA754FB473984ABE0A32FDE8301-750x400.jpg
                 * iconImage : /images/568/JPG-8DF89C0D2C02400F8708A276A56E356F-321x321.jpg
                 * createTime : 1475027157000
                 * updateTime : 1482572146000
                 * seq : 0
                 * status : 0
                 * sellerVisible : true
                 * memberVisible : true
                 * statusComm : 新建
                 * levelComm : 三级
                 */

                private int id;
                private int parentId;
                private int typeId;
                private String path;
                private int level;
                private String name;
                private String keyword;
                private String masterImage;
                private String iconImage;
                private long createTime;
                private long updateTime;
                private int seq;
                private int status;
                private boolean sellerVisible;
                private boolean memberVisible;
                private String statusComm;
                private String levelComm;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public int getParentId() {
                    return parentId;
                }

                public void setParentId(int parentId) {
                    this.parentId = parentId;
                }

                public int getTypeId() {
                    return typeId;
                }

                public void setTypeId(int typeId) {
                    this.typeId = typeId;
                }

                public String getPath() {
                    return path;
                }

                public void setPath(String path) {
                    this.path = path;
                }

                public int getLevel() {
                    return level;
                }

                public void setLevel(int level) {
                    this.level = level;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getKeyword() {
                    return keyword;
                }

                public void setKeyword(String keyword) {
                    this.keyword = keyword;
                }

                public String getMasterImage() {
                    return masterImage;
                }

                public void setMasterImage(String masterImage) {
                    this.masterImage = masterImage;
                }

                public String getIconImage() {
                    return iconImage;
                }

                public void setIconImage(String iconImage) {
                    this.iconImage = iconImage;
                }

                public long getCreateTime() {
                    return createTime;
                }

                public void setCreateTime(long createTime) {
                    this.createTime = createTime;
                }

                public long getUpdateTime() {
                    return updateTime;
                }

                public void setUpdateTime(long updateTime) {
                    this.updateTime = updateTime;
                }

                public int getSeq() {
                    return seq;
                }

                public void setSeq(int seq) {
                    this.seq = seq;
                }

                public int getStatus() {
                    return status;
                }

                public void setStatus(int status) {
                    this.status = status;
                }

                public boolean isSellerVisible() {
                    return sellerVisible;
                }

                public void setSellerVisible(boolean sellerVisible) {
                    this.sellerVisible = sellerVisible;
                }

                public boolean isMemberVisible() {
                    return memberVisible;
                }

                public void setMemberVisible(boolean memberVisible) {
                    this.memberVisible = memberVisible;
                }

                public String getStatusComm() {
                    return statusComm;
                }

                public void setStatusComm(String statusComm) {
                    this.statusComm = statusComm;
                }

                public String getLevelComm() {
                    return levelComm;
                }

                public void setLevelComm(String levelComm) {
                    this.levelComm = levelComm;
                }
            }
        }

        public static class CategoryImageVoListBean {
            /**
             * category : {"id":7,"parentId":0,"typeId":1,"path":"","level":1,"name":"食品保健","keyword":"食品","masterImage":"/images/947/JPG-644D512F6E1D483B9D97F42B68AFD8CD-750x400.jpg","iconImage":"","createTime":1475026548000,"updateTime":1493185899000,"seq":0,"status":0,"sellerVisible":true,"memberVisible":true,"statusComm":"新建","levelComm":"一级"}
             * image : /images/663/JPG-2560FFE50BE742C89A770E39BBC70A72-750x403.jpg
             */

            private CategoryBeanX category;
            private String image;

            public CategoryBeanX getCategory() {
                return category;
            }

            public void setCategory(CategoryBeanX category) {
                this.category = category;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public static class CategoryBeanX {
                /**
                 * id : 7
                 * parentId : 0
                 * typeId : 1
                 * path :
                 * level : 1
                 * name : 食品保健
                 * keyword : 食品
                 * masterImage : /images/947/JPG-644D512F6E1D483B9D97F42B68AFD8CD-750x400.jpg
                 * iconImage :
                 * createTime : 1475026548000
                 * updateTime : 1493185899000
                 * seq : 0
                 * status : 0
                 * sellerVisible : true
                 * memberVisible : true
                 * statusComm : 新建
                 * levelComm : 一级
                 */

                private int id;
                private int parentId;
                private int typeId;
                private String path;
                private int level;
                private String name;
                private String keyword;
                private String masterImage;
                private String iconImage;
                private long createTime;
                private long updateTime;
                private int seq;
                private int status;
                private boolean sellerVisible;
                private boolean memberVisible;
                private String statusComm;
                private String levelComm;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public int getParentId() {
                    return parentId;
                }

                public void setParentId(int parentId) {
                    this.parentId = parentId;
                }

                public int getTypeId() {
                    return typeId;
                }

                public void setTypeId(int typeId) {
                    this.typeId = typeId;
                }

                public String getPath() {
                    return path;
                }

                public void setPath(String path) {
                    this.path = path;
                }

                public int getLevel() {
                    return level;
                }

                public void setLevel(int level) {
                    this.level = level;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getKeyword() {
                    return keyword;
                }

                public void setKeyword(String keyword) {
                    this.keyword = keyword;
                }

                public String getMasterImage() {
                    return masterImage;
                }

                public void setMasterImage(String masterImage) {
                    this.masterImage = masterImage;
                }

                public String getIconImage() {
                    return iconImage;
                }

                public void setIconImage(String iconImage) {
                    this.iconImage = iconImage;
                }

                public long getCreateTime() {
                    return createTime;
                }

                public void setCreateTime(long createTime) {
                    this.createTime = createTime;
                }

                public long getUpdateTime() {
                    return updateTime;
                }

                public void setUpdateTime(long updateTime) {
                    this.updateTime = updateTime;
                }

                public int getSeq() {
                    return seq;
                }

                public void setSeq(int seq) {
                    this.seq = seq;
                }

                public int getStatus() {
                    return status;
                }

                public void setStatus(int status) {
                    this.status = status;
                }

                public boolean isSellerVisible() {
                    return sellerVisible;
                }

                public void setSellerVisible(boolean sellerVisible) {
                    this.sellerVisible = sellerVisible;
                }

                public boolean isMemberVisible() {
                    return memberVisible;
                }

                public void setMemberVisible(boolean memberVisible) {
                    this.memberVisible = memberVisible;
                }

                public String getStatusComm() {
                    return statusComm;
                }

                public void setStatusComm(String statusComm) {
                    this.statusComm = statusComm;
                }

                public String getLevelComm() {
                    return levelComm;
                }

                public void setLevelComm(String levelComm) {
                    this.levelComm = levelComm;
                }
            }
        }

        public static class BrandImageListBean {
            /**
             * image : /images/970/JPG-CCADBBEBE1AE45AC86B0EDAC0202EB89-750x403.jpg
             * url : http://test.emateglobal.com/product/queryProductByBrandId.html?brandId=33
             */

            private String image;
            private String url;

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }

        public static class SubjectImageListBean {
            /**
             * image : /images/300/JPG-520F760120064F639C1AA7BE30AA1E9C-720x1280.jpg
             * url : http://www.ba.com
             */

            private String image;
            private String url;

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }

        public static class ButtomProductListBean {
            /**
             * product : {"id":2590,"sellerId":1,"categoryId":64,"typeId":60,"name":"5.5虚拟产品","promotionMessage":"","keyword":"","brandId":12,"self":true,"startTime":1493965379000,"remark":"&lt;p&gt;&lt;br/&gt;&lt;img src=\"http://test.emateglobal.com:8090/shop-image/images/524/JPG-D9C5C913482742468DB3D73251E50FFB-640x480.jpg\" _src=\"http://test.emateglobal.com:8090/shop-image/images/524/JPG-D9C5C913482742468DB3D73251E50FFB-640x480.jpg\"/&gt;&lt;/p&gt;","packageList":"1111","suit":false,"suitRelationProductIds":"","productUsefull":1,"collectiveProduct":true,"collectiveCountLimit":1,"creatorId":1,"virtualProduct":true,"masterImage":"/images/70/JPG-5B1F1936079547E1A1BB523A7C4C2F6E-750x750.jpg","transportTplId":0,"baseWeight":0,"addWeight":0,"supplyId":0,"salesAmount":0,"strictCheck":false,"checking":false,"efenbaoIntegralTransable":false,"huiCoinTransable":false,"fuping":false,"limitNumber":0,"limitStartTime":-2209017600000,"limitEndTime":32535100800000,"createTime":1493965131000,"updateTime":1494259238000,"seq":0,"status":5,"checkRemark":"","statusComm":"上架","productUsefullComm":"出售"}
             * category : {"id":64,"parentId":48,"typeId":60,"path":"","level":3,"name":"洗发","keyword":"洗发","masterImage":"/images/249/JPG-C0614AA754FB473984ABE0A32FDE8301-750x400.jpg","iconImage":"/images/568/JPG-8DF89C0D2C02400F8708A276A56E356F-321x321.jpg","createTime":1475027157000,"updateTime":1482572146000,"seq":0,"status":0,"sellerVisible":true,"memberVisible":true,"statusComm":"新建","levelComm":"三级"}
             * imgPath : ["/images/70/JPG-5B1F1936079547E1A1BB523A7C4C2F6E-750x750.jpg"]
             * minPrice : 0.1
             * maxPrice : 0.1
             * minMallPrice : 20.0
             * maxMallPrice : 20.0
             * allStock : 345
             * goodsSpecVo : null
             */

            private ProductBeanX product;
            private CategoryBeanXX category;
            private double minPrice;
            private double maxPrice;
            private double minMallPrice;
            private double maxMallPrice;
            private int allStock;
            private Object goodsSpecVo;
            private List<String> imgPath;

            public ProductBeanX getProduct() {
                return product;
            }

            public void setProduct(ProductBeanX product) {
                this.product = product;
            }

            public CategoryBeanXX getCategory() {
                return category;
            }

            public void setCategory(CategoryBeanXX category) {
                this.category = category;
            }

            public double getMinPrice() {
                return minPrice;
            }

            public void setMinPrice(double minPrice) {
                this.minPrice = minPrice;
            }

            public double getMaxPrice() {
                return maxPrice;
            }

            public void setMaxPrice(double maxPrice) {
                this.maxPrice = maxPrice;
            }

            public double getMinMallPrice() {
                return minMallPrice;
            }

            public void setMinMallPrice(double minMallPrice) {
                this.minMallPrice = minMallPrice;
            }

            public double getMaxMallPrice() {
                return maxMallPrice;
            }

            public void setMaxMallPrice(double maxMallPrice) {
                this.maxMallPrice = maxMallPrice;
            }

            public int getAllStock() {
                return allStock;
            }

            public void setAllStock(int allStock) {
                this.allStock = allStock;
            }

            public Object getGoodsSpecVo() {
                return goodsSpecVo;
            }

            public void setGoodsSpecVo(Object goodsSpecVo) {
                this.goodsSpecVo = goodsSpecVo;
            }

            public List<String> getImgPath() {
                return imgPath;
            }

            public void setImgPath(List<String> imgPath) {
                this.imgPath = imgPath;
            }

            public static class ProductBeanX {
                /**
                 * id : 2590
                 * sellerId : 1
                 * categoryId : 64
                 * typeId : 60
                 * name : 5.5虚拟产品
                 * promotionMessage :
                 * keyword :
                 * brandId : 12
                 * self : true
                 * startTime : 1493965379000
                 * remark : &lt;p&gt;&lt;br/&gt;&lt;img src="http://test.emateglobal.com:8090/shop-image/images/524/JPG-D9C5C913482742468DB3D73251E50FFB-640x480.jpg" _src="http://test.emateglobal.com:8090/shop-image/images/524/JPG-D9C5C913482742468DB3D73251E50FFB-640x480.jpg"/&gt;&lt;/p&gt;
                 * packageList : 1111
                 * suit : false
                 * suitRelationProductIds :
                 * productUsefull : 1
                 * collectiveProduct : true
                 * collectiveCountLimit : 1
                 * creatorId : 1
                 * virtualProduct : true
                 * masterImage : /images/70/JPG-5B1F1936079547E1A1BB523A7C4C2F6E-750x750.jpg
                 * transportTplId : 0
                 * baseWeight : 0.0
                 * addWeight : 0.0
                 * supplyId : 0
                 * salesAmount : 0
                 * strictCheck : false
                 * checking : false
                 * efenbaoIntegralTransable : false
                 * huiCoinTransable : false
                 * fuping : false
                 * limitNumber : 0
                 * limitStartTime : -2209017600000
                 * limitEndTime : 32535100800000
                 * createTime : 1493965131000
                 * updateTime : 1494259238000
                 * seq : 0
                 * status : 5
                 * checkRemark :
                 * statusComm : 上架
                 * productUsefullComm : 出售
                 */

                private int id;
                private int sellerId;
                private int categoryId;
                private int typeId;
                private String name;
                private String promotionMessage;
                private String keyword;
                private int brandId;
                private boolean self;
                private long startTime;
                private String remark;
                private String packageList;
                private boolean suit;
                private String suitRelationProductIds;
                private int productUsefull;
                private boolean collectiveProduct;
                private int collectiveCountLimit;
                private int creatorId;
                private boolean virtualProduct;
                private String masterImage;
                private int transportTplId;
                private double baseWeight;
                private double addWeight;
                private int supplyId;
                private int salesAmount;
                private boolean strictCheck;
                private boolean checking;
                private boolean efenbaoIntegralTransable;
                private boolean huiCoinTransable;
                private boolean fuping;
                private int limitNumber;
                private long limitStartTime;
                private long limitEndTime;
                private long createTime;
                private long updateTime;
                private int seq;
                private int status;
                private String checkRemark;
                private String statusComm;
                private String productUsefullComm;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public int getSellerId() {
                    return sellerId;
                }

                public void setSellerId(int sellerId) {
                    this.sellerId = sellerId;
                }

                public int getCategoryId() {
                    return categoryId;
                }

                public void setCategoryId(int categoryId) {
                    this.categoryId = categoryId;
                }

                public int getTypeId() {
                    return typeId;
                }

                public void setTypeId(int typeId) {
                    this.typeId = typeId;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getPromotionMessage() {
                    return promotionMessage;
                }

                public void setPromotionMessage(String promotionMessage) {
                    this.promotionMessage = promotionMessage;
                }

                public String getKeyword() {
                    return keyword;
                }

                public void setKeyword(String keyword) {
                    this.keyword = keyword;
                }

                public int getBrandId() {
                    return brandId;
                }

                public void setBrandId(int brandId) {
                    this.brandId = brandId;
                }

                public boolean isSelf() {
                    return self;
                }

                public void setSelf(boolean self) {
                    this.self = self;
                }

                public long getStartTime() {
                    return startTime;
                }

                public void setStartTime(long startTime) {
                    this.startTime = startTime;
                }

                public String getRemark() {
                    return remark;
                }

                public void setRemark(String remark) {
                    this.remark = remark;
                }

                public String getPackageList() {
                    return packageList;
                }

                public void setPackageList(String packageList) {
                    this.packageList = packageList;
                }

                public boolean isSuit() {
                    return suit;
                }

                public void setSuit(boolean suit) {
                    this.suit = suit;
                }

                public String getSuitRelationProductIds() {
                    return suitRelationProductIds;
                }

                public void setSuitRelationProductIds(String suitRelationProductIds) {
                    this.suitRelationProductIds = suitRelationProductIds;
                }

                public int getProductUsefull() {
                    return productUsefull;
                }

                public void setProductUsefull(int productUsefull) {
                    this.productUsefull = productUsefull;
                }

                public boolean isCollectiveProduct() {
                    return collectiveProduct;
                }

                public void setCollectiveProduct(boolean collectiveProduct) {
                    this.collectiveProduct = collectiveProduct;
                }

                public int getCollectiveCountLimit() {
                    return collectiveCountLimit;
                }

                public void setCollectiveCountLimit(int collectiveCountLimit) {
                    this.collectiveCountLimit = collectiveCountLimit;
                }

                public int getCreatorId() {
                    return creatorId;
                }

                public void setCreatorId(int creatorId) {
                    this.creatorId = creatorId;
                }

                public boolean isVirtualProduct() {
                    return virtualProduct;
                }

                public void setVirtualProduct(boolean virtualProduct) {
                    this.virtualProduct = virtualProduct;
                }

                public String getMasterImage() {
                    return masterImage;
                }

                public void setMasterImage(String masterImage) {
                    this.masterImage = masterImage;
                }

                public int getTransportTplId() {
                    return transportTplId;
                }

                public void setTransportTplId(int transportTplId) {
                    this.transportTplId = transportTplId;
                }

                public double getBaseWeight() {
                    return baseWeight;
                }

                public void setBaseWeight(double baseWeight) {
                    this.baseWeight = baseWeight;
                }

                public double getAddWeight() {
                    return addWeight;
                }

                public void setAddWeight(double addWeight) {
                    this.addWeight = addWeight;
                }

                public int getSupplyId() {
                    return supplyId;
                }

                public void setSupplyId(int supplyId) {
                    this.supplyId = supplyId;
                }

                public int getSalesAmount() {
                    return salesAmount;
                }

                public void setSalesAmount(int salesAmount) {
                    this.salesAmount = salesAmount;
                }

                public boolean isStrictCheck() {
                    return strictCheck;
                }

                public void setStrictCheck(boolean strictCheck) {
                    this.strictCheck = strictCheck;
                }

                public boolean isChecking() {
                    return checking;
                }

                public void setChecking(boolean checking) {
                    this.checking = checking;
                }

                public boolean isEfenbaoIntegralTransable() {
                    return efenbaoIntegralTransable;
                }

                public void setEfenbaoIntegralTransable(boolean efenbaoIntegralTransable) {
                    this.efenbaoIntegralTransable = efenbaoIntegralTransable;
                }

                public boolean isHuiCoinTransable() {
                    return huiCoinTransable;
                }

                public void setHuiCoinTransable(boolean huiCoinTransable) {
                    this.huiCoinTransable = huiCoinTransable;
                }

                public boolean isFuping() {
                    return fuping;
                }

                public void setFuping(boolean fuping) {
                    this.fuping = fuping;
                }

                public int getLimitNumber() {
                    return limitNumber;
                }

                public void setLimitNumber(int limitNumber) {
                    this.limitNumber = limitNumber;
                }

                public long getLimitStartTime() {
                    return limitStartTime;
                }

                public void setLimitStartTime(long limitStartTime) {
                    this.limitStartTime = limitStartTime;
                }

                public long getLimitEndTime() {
                    return limitEndTime;
                }

                public void setLimitEndTime(long limitEndTime) {
                    this.limitEndTime = limitEndTime;
                }

                public long getCreateTime() {
                    return createTime;
                }

                public void setCreateTime(long createTime) {
                    this.createTime = createTime;
                }

                public long getUpdateTime() {
                    return updateTime;
                }

                public void setUpdateTime(long updateTime) {
                    this.updateTime = updateTime;
                }

                public int getSeq() {
                    return seq;
                }

                public void setSeq(int seq) {
                    this.seq = seq;
                }

                public int getStatus() {
                    return status;
                }

                public void setStatus(int status) {
                    this.status = status;
                }

                public String getCheckRemark() {
                    return checkRemark;
                }

                public void setCheckRemark(String checkRemark) {
                    this.checkRemark = checkRemark;
                }

                public String getStatusComm() {
                    return statusComm;
                }

                public void setStatusComm(String statusComm) {
                    this.statusComm = statusComm;
                }

                public String getProductUsefullComm() {
                    return productUsefullComm;
                }

                public void setProductUsefullComm(String productUsefullComm) {
                    this.productUsefullComm = productUsefullComm;
                }
            }

            public static class CategoryBeanXX {
                /**
                 * id : 64
                 * parentId : 48
                 * typeId : 60
                 * path :
                 * level : 3
                 * name : 洗发
                 * keyword : 洗发
                 * masterImage : /images/249/JPG-C0614AA754FB473984ABE0A32FDE8301-750x400.jpg
                 * iconImage : /images/568/JPG-8DF89C0D2C02400F8708A276A56E356F-321x321.jpg
                 * createTime : 1475027157000
                 * updateTime : 1482572146000
                 * seq : 0
                 * status : 0
                 * sellerVisible : true
                 * memberVisible : true
                 * statusComm : 新建
                 * levelComm : 三级
                 */

                private int id;
                private int parentId;
                private int typeId;
                private String path;
                private int level;
                private String name;
                private String keyword;
                private String masterImage;
                private String iconImage;
                private long createTime;
                private long updateTime;
                private int seq;
                private int status;
                private boolean sellerVisible;
                private boolean memberVisible;
                private String statusComm;
                private String levelComm;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public int getParentId() {
                    return parentId;
                }

                public void setParentId(int parentId) {
                    this.parentId = parentId;
                }

                public int getTypeId() {
                    return typeId;
                }

                public void setTypeId(int typeId) {
                    this.typeId = typeId;
                }

                public String getPath() {
                    return path;
                }

                public void setPath(String path) {
                    this.path = path;
                }

                public int getLevel() {
                    return level;
                }

                public void setLevel(int level) {
                    this.level = level;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getKeyword() {
                    return keyword;
                }

                public void setKeyword(String keyword) {
                    this.keyword = keyword;
                }

                public String getMasterImage() {
                    return masterImage;
                }

                public void setMasterImage(String masterImage) {
                    this.masterImage = masterImage;
                }

                public String getIconImage() {
                    return iconImage;
                }

                public void setIconImage(String iconImage) {
                    this.iconImage = iconImage;
                }

                public long getCreateTime() {
                    return createTime;
                }

                public void setCreateTime(long createTime) {
                    this.createTime = createTime;
                }

                public long getUpdateTime() {
                    return updateTime;
                }

                public void setUpdateTime(long updateTime) {
                    this.updateTime = updateTime;
                }

                public int getSeq() {
                    return seq;
                }

                public void setSeq(int seq) {
                    this.seq = seq;
                }

                public int getStatus() {
                    return status;
                }

                public void setStatus(int status) {
                    this.status = status;
                }

                public boolean isSellerVisible() {
                    return sellerVisible;
                }

                public void setSellerVisible(boolean sellerVisible) {
                    this.sellerVisible = sellerVisible;
                }

                public boolean isMemberVisible() {
                    return memberVisible;
                }

                public void setMemberVisible(boolean memberVisible) {
                    this.memberVisible = memberVisible;
                }

                public String getStatusComm() {
                    return statusComm;
                }

                public void setStatusComm(String statusComm) {
                    this.statusComm = statusComm;
                }

                public String getLevelComm() {
                    return levelComm;
                }

                public void setLevelComm(String levelComm) {
                    this.levelComm = levelComm;
                }
            }
        }

        public static class AreaListBean {
            /**
             * areaName : 222333333
             * areaImage : /images/250/JPG-70CC5FB685BE408AAFA0E7E8E496B5A0-750x584.jpg
             * productList : [{"id":262,"sellerId":1,"categoryId":12,"typeId":37,"name":"三只松鼠 蜜饯果干 休闲零食 芒果干116g/袋","promotionMessage":"休闲零食","keyword":"三只松鼠,芒果干","brandId":15,"self":true,"startTime":1493088112000,"remark":"&lt;p&gt;&lt;br/&gt;&lt;/p&gt;&lt;p&gt;&lt;img src=\"https://img.emateglobal.com/shop-image/images/938/JPG-1ABEAEF1A7AD4120B4C5441C99CD431B-750x1967.jpg\" _src=\"https://img.emateglobal.com/shop-image/images/938/JPG-1ABEAEF1A7AD4120B4C5441C99CD431B-750x1967.jpg\" style=\"\"/&gt;&lt;/p&gt;&lt;p&gt;&lt;img src=\"https://img.emateglobal.com/shop-image/images/606/JPG-6ACA651024764D4288FCB49785F120C0-750x1639.jpg\" _src=\"https://img.emateglobal.com/shop-image/images/606/JPG-6ACA651024764D4288FCB49785F120C0-750x1639.jpg\" style=\"\"/&gt;&lt;/p&gt;&lt;p&gt;&lt;img src=\"https://img.emateglobal.com/shop-image/images/368/JPG-48ED0314633B46C285E02955BBE3C2E8-750x2254.jpg\" _src=\"https://img.emateglobal.com/shop-image/images/368/JPG-48ED0314633B46C285E02955BBE3C2E8-750x2254.jpg\" style=\"\"/&gt;&lt;/p&gt;&lt;p&gt;&lt;br/&gt;&lt;/p&gt;","packageList":"三只松鼠 蜜饯果干 休闲零食 芒果干116g/袋","suit":false,"suitRelationProductIds":"","productUsefull":1,"collectiveProduct":false,"collectiveCountLimit":1,"creatorId":1,"virtualProduct":false,"masterImage":"/images/519/JPG-D7CC2A20226B4D5080CF785B6B69065E-800x800.jpg","transportTplId":0,"baseWeight":1,"addWeight":0,"supplyId":0,"salesAmount":0,"strictCheck":false,"checking":false,"efenbaoIntegralTransable":false,"huiCoinTransable":false,"fuping":false,"limitNumber":0,"limitStartTime":-2209017600000,"limitEndTime":32535100800000,"createTime":1476339332000,"updateTime":1494259236000,"seq":0,"status":5,"checkRemark":"","statusComm":"上架","productUsefullComm":"出售"},{"id":262,"sellerId":1,"categoryId":12,"typeId":37,"name":"三只松鼠 蜜饯果干 休闲零食 芒果干116g/袋","promotionMessage":"休闲零食","keyword":"三只松鼠,芒果干","brandId":15,"self":true,"startTime":1493088112000,"remark":"&lt;p&gt;&lt;br/&gt;&lt;/p&gt;&lt;p&gt;&lt;img src=\"https://img.emateglobal.com/shop-image/images/938/JPG-1ABEAEF1A7AD4120B4C5441C99CD431B-750x1967.jpg\" _src=\"https://img.emateglobal.com/shop-image/images/938/JPG-1ABEAEF1A7AD4120B4C5441C99CD431B-750x1967.jpg\" style=\"\"/&gt;&lt;/p&gt;&lt;p&gt;&lt;img src=\"https://img.emateglobal.com/shop-image/images/606/JPG-6ACA651024764D4288FCB49785F120C0-750x1639.jpg\" _src=\"https://img.emateglobal.com/shop-image/images/606/JPG-6ACA651024764D4288FCB49785F120C0-750x1639.jpg\" style=\"\"/&gt;&lt;/p&gt;&lt;p&gt;&lt;img src=\"https://img.emateglobal.com/shop-image/images/368/JPG-48ED0314633B46C285E02955BBE3C2E8-750x2254.jpg\" _src=\"https://img.emateglobal.com/shop-image/images/368/JPG-48ED0314633B46C285E02955BBE3C2E8-750x2254.jpg\" style=\"\"/&gt;&lt;/p&gt;&lt;p&gt;&lt;br/&gt;&lt;/p&gt;","packageList":"三只松鼠 蜜饯果干 休闲零食 芒果干116g/袋","suit":false,"suitRelationProductIds":"","productUsefull":1,"collectiveProduct":false,"collectiveCountLimit":1,"creatorId":1,"virtualProduct":false,"masterImage":"/images/519/JPG-D7CC2A20226B4D5080CF785B6B69065E-800x800.jpg","transportTplId":0,"baseWeight":1,"addWeight":0,"supplyId":0,"salesAmount":0,"strictCheck":false,"checking":false,"efenbaoIntegralTransable":false,"huiCoinTransable":false,"fuping":false,"limitNumber":0,"limitStartTime":-2209017600000,"limitEndTime":32535100800000,"createTime":1476339332000,"updateTime":1494259236000,"seq":0,"status":5,"checkRemark":"","statusComm":"上架","productUsefullComm":"出售"},{"id":262,"sellerId":1,"categoryId":12,"typeId":37,"name":"三只松鼠 蜜饯果干 休闲零食 芒果干116g/袋","promotionMessage":"休闲零食","keyword":"三只松鼠,芒果干","brandId":15,"self":true,"startTime":1493088112000,"remark":"&lt;p&gt;&lt;br/&gt;&lt;/p&gt;&lt;p&gt;&lt;img src=\"https://img.emateglobal.com/shop-image/images/938/JPG-1ABEAEF1A7AD4120B4C5441C99CD431B-750x1967.jpg\" _src=\"https://img.emateglobal.com/shop-image/images/938/JPG-1ABEAEF1A7AD4120B4C5441C99CD431B-750x1967.jpg\" style=\"\"/&gt;&lt;/p&gt;&lt;p&gt;&lt;img src=\"https://img.emateglobal.com/shop-image/images/606/JPG-6ACA651024764D4288FCB49785F120C0-750x1639.jpg\" _src=\"https://img.emateglobal.com/shop-image/images/606/JPG-6ACA651024764D4288FCB49785F120C0-750x1639.jpg\" style=\"\"/&gt;&lt;/p&gt;&lt;p&gt;&lt;img src=\"https://img.emateglobal.com/shop-image/images/368/JPG-48ED0314633B46C285E02955BBE3C2E8-750x2254.jpg\" _src=\"https://img.emateglobal.com/shop-image/images/368/JPG-48ED0314633B46C285E02955BBE3C2E8-750x2254.jpg\" style=\"\"/&gt;&lt;/p&gt;&lt;p&gt;&lt;br/&gt;&lt;/p&gt;","packageList":"三只松鼠 蜜饯果干 休闲零食 芒果干116g/袋","suit":false,"suitRelationProductIds":"","productUsefull":1,"collectiveProduct":false,"collectiveCountLimit":1,"creatorId":1,"virtualProduct":false,"masterImage":"/images/519/JPG-D7CC2A20226B4D5080CF785B6B69065E-800x800.jpg","transportTplId":0,"baseWeight":1,"addWeight":0,"supplyId":0,"salesAmount":0,"strictCheck":false,"checking":false,"efenbaoIntegralTransable":false,"huiCoinTransable":false,"fuping":false,"limitNumber":0,"limitStartTime":-2209017600000,"limitEndTime":32535100800000,"createTime":1476339332000,"updateTime":1494259236000,"seq":0,"status":5,"checkRemark":"","statusComm":"上架","productUsefullComm":"出售"},{"id":262,"sellerId":1,"categoryId":12,"typeId":37,"name":"三只松鼠 蜜饯果干 休闲零食 芒果干116g/袋","promotionMessage":"休闲零食","keyword":"三只松鼠,芒果干","brandId":15,"self":true,"startTime":1493088112000,"remark":"&lt;p&gt;&lt;br/&gt;&lt;/p&gt;&lt;p&gt;&lt;img src=\"https://img.emateglobal.com/shop-image/images/938/JPG-1ABEAEF1A7AD4120B4C5441C99CD431B-750x1967.jpg\" _src=\"https://img.emateglobal.com/shop-image/images/938/JPG-1ABEAEF1A7AD4120B4C5441C99CD431B-750x1967.jpg\" style=\"\"/&gt;&lt;/p&gt;&lt;p&gt;&lt;img src=\"https://img.emateglobal.com/shop-image/images/606/JPG-6ACA651024764D4288FCB49785F120C0-750x1639.jpg\" _src=\"https://img.emateglobal.com/shop-image/images/606/JPG-6ACA651024764D4288FCB49785F120C0-750x1639.jpg\" style=\"\"/&gt;&lt;/p&gt;&lt;p&gt;&lt;img src=\"https://img.emateglobal.com/shop-image/images/368/JPG-48ED0314633B46C285E02955BBE3C2E8-750x2254.jpg\" _src=\"https://img.emateglobal.com/shop-image/images/368/JPG-48ED0314633B46C285E02955BBE3C2E8-750x2254.jpg\" style=\"\"/&gt;&lt;/p&gt;&lt;p&gt;&lt;br/&gt;&lt;/p&gt;","packageList":"三只松鼠 蜜饯果干 休闲零食 芒果干116g/袋","suit":false,"suitRelationProductIds":"","productUsefull":1,"collectiveProduct":false,"collectiveCountLimit":1,"creatorId":1,"virtualProduct":false,"masterImage":"/images/519/JPG-D7CC2A20226B4D5080CF785B6B69065E-800x800.jpg","transportTplId":0,"baseWeight":1,"addWeight":0,"supplyId":0,"salesAmount":0,"strictCheck":false,"checking":false,"efenbaoIntegralTransable":false,"huiCoinTransable":false,"fuping":false,"limitNumber":0,"limitStartTime":-2209017600000,"limitEndTime":32535100800000,"createTime":1476339332000,"updateTime":1494259236000,"seq":0,"status":5,"checkRemark":"","statusComm":"上架","productUsefullComm":"出售"}]
             */

            private String areaName;
            private String areaImage;
            private List<ProductListBeanX> productList;

            public String getAreaName() {
                return areaName;
            }

            public void setAreaName(String areaName) {
                this.areaName = areaName;
            }

            public String getAreaImage() {
                return areaImage;
            }

            public void setAreaImage(String areaImage) {
                this.areaImage = areaImage;
            }

            public List<ProductListBeanX> getProductList() {
                return productList;
            }

            public void setProductList(List<ProductListBeanX> productList) {
                this.productList = productList;
            }

            public static class ProductListBeanX {
                /**
                 * id : 262
                 * sellerId : 1
                 * categoryId : 12
                 * typeId : 37
                 * name : 三只松鼠 蜜饯果干 休闲零食 芒果干116g/袋
                 * promotionMessage : 休闲零食
                 * keyword : 三只松鼠,芒果干
                 * brandId : 15
                 * self : true
                 * startTime : 1493088112000
                 * remark : &lt;p&gt;&lt;br/&gt;&lt;/p&gt;&lt;p&gt;&lt;img src="https://img.emateglobal.com/shop-image/images/938/JPG-1ABEAEF1A7AD4120B4C5441C99CD431B-750x1967.jpg" _src="https://img.emateglobal.com/shop-image/images/938/JPG-1ABEAEF1A7AD4120B4C5441C99CD431B-750x1967.jpg" style=""/&gt;&lt;/p&gt;&lt;p&gt;&lt;img src="https://img.emateglobal.com/shop-image/images/606/JPG-6ACA651024764D4288FCB49785F120C0-750x1639.jpg" _src="https://img.emateglobal.com/shop-image/images/606/JPG-6ACA651024764D4288FCB49785F120C0-750x1639.jpg" style=""/&gt;&lt;/p&gt;&lt;p&gt;&lt;img src="https://img.emateglobal.com/shop-image/images/368/JPG-48ED0314633B46C285E02955BBE3C2E8-750x2254.jpg" _src="https://img.emateglobal.com/shop-image/images/368/JPG-48ED0314633B46C285E02955BBE3C2E8-750x2254.jpg" style=""/&gt;&lt;/p&gt;&lt;p&gt;&lt;br/&gt;&lt;/p&gt;
                 * packageList : 三只松鼠 蜜饯果干 休闲零食 芒果干116g/袋
                 * suit : false
                 * suitRelationProductIds :
                 * productUsefull : 1
                 * collectiveProduct : false
                 * collectiveCountLimit : 1
                 * creatorId : 1
                 * virtualProduct : false
                 * masterImage : /images/519/JPG-D7CC2A20226B4D5080CF785B6B69065E-800x800.jpg
                 * transportTplId : 0
                 * baseWeight : 1.0
                 * addWeight : 0.0
                 * supplyId : 0
                 * salesAmount : 0
                 * strictCheck : false
                 * checking : false
                 * efenbaoIntegralTransable : false
                 * huiCoinTransable : false
                 * fuping : false
                 * limitNumber : 0
                 * limitStartTime : -2209017600000
                 * limitEndTime : 32535100800000
                 * createTime : 1476339332000
                 * updateTime : 1494259236000
                 * seq : 0
                 * status : 5
                 * checkRemark :
                 * statusComm : 上架
                 * productUsefullComm : 出售
                 */

                private int id;
                private int sellerId;
                private int categoryId;
                private int typeId;
                private String name;
                private String promotionMessage;
                private String keyword;
                private int brandId;
                private boolean self;
                private long startTime;
                private String remark;
                private String packageList;
                private boolean suit;
                private String suitRelationProductIds;
                private int productUsefull;
                private boolean collectiveProduct;
                private int collectiveCountLimit;
                private int creatorId;
                private boolean virtualProduct;
                private String masterImage;
                private int transportTplId;
                private double baseWeight;
                private double addWeight;
                private int supplyId;
                private int salesAmount;
                private boolean strictCheck;
                private boolean checking;
                private boolean efenbaoIntegralTransable;
                private boolean huiCoinTransable;
                private boolean fuping;
                private int limitNumber;
                private long limitStartTime;
                private long limitEndTime;
                private long createTime;
                private long updateTime;
                private int seq;
                private int status;
                private String checkRemark;
                private String statusComm;
                private String productUsefullComm;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public int getSellerId() {
                    return sellerId;
                }

                public void setSellerId(int sellerId) {
                    this.sellerId = sellerId;
                }

                public int getCategoryId() {
                    return categoryId;
                }

                public void setCategoryId(int categoryId) {
                    this.categoryId = categoryId;
                }

                public int getTypeId() {
                    return typeId;
                }

                public void setTypeId(int typeId) {
                    this.typeId = typeId;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getPromotionMessage() {
                    return promotionMessage;
                }

                public void setPromotionMessage(String promotionMessage) {
                    this.promotionMessage = promotionMessage;
                }

                public String getKeyword() {
                    return keyword;
                }

                public void setKeyword(String keyword) {
                    this.keyword = keyword;
                }

                public int getBrandId() {
                    return brandId;
                }

                public void setBrandId(int brandId) {
                    this.brandId = brandId;
                }

                public boolean isSelf() {
                    return self;
                }

                public void setSelf(boolean self) {
                    this.self = self;
                }

                public long getStartTime() {
                    return startTime;
                }

                public void setStartTime(long startTime) {
                    this.startTime = startTime;
                }

                public String getRemark() {
                    return remark;
                }

                public void setRemark(String remark) {
                    this.remark = remark;
                }

                public String getPackageList() {
                    return packageList;
                }

                public void setPackageList(String packageList) {
                    this.packageList = packageList;
                }

                public boolean isSuit() {
                    return suit;
                }

                public void setSuit(boolean suit) {
                    this.suit = suit;
                }

                public String getSuitRelationProductIds() {
                    return suitRelationProductIds;
                }

                public void setSuitRelationProductIds(String suitRelationProductIds) {
                    this.suitRelationProductIds = suitRelationProductIds;
                }

                public int getProductUsefull() {
                    return productUsefull;
                }

                public void setProductUsefull(int productUsefull) {
                    this.productUsefull = productUsefull;
                }

                public boolean isCollectiveProduct() {
                    return collectiveProduct;
                }

                public void setCollectiveProduct(boolean collectiveProduct) {
                    this.collectiveProduct = collectiveProduct;
                }

                public int getCollectiveCountLimit() {
                    return collectiveCountLimit;
                }

                public void setCollectiveCountLimit(int collectiveCountLimit) {
                    this.collectiveCountLimit = collectiveCountLimit;
                }

                public int getCreatorId() {
                    return creatorId;
                }

                public void setCreatorId(int creatorId) {
                    this.creatorId = creatorId;
                }

                public boolean isVirtualProduct() {
                    return virtualProduct;
                }

                public void setVirtualProduct(boolean virtualProduct) {
                    this.virtualProduct = virtualProduct;
                }

                public String getMasterImage() {
                    return masterImage;
                }

                public void setMasterImage(String masterImage) {
                    this.masterImage = masterImage;
                }

                public int getTransportTplId() {
                    return transportTplId;
                }

                public void setTransportTplId(int transportTplId) {
                    this.transportTplId = transportTplId;
                }

                public double getBaseWeight() {
                    return baseWeight;
                }

                public void setBaseWeight(double baseWeight) {
                    this.baseWeight = baseWeight;
                }

                public double getAddWeight() {
                    return addWeight;
                }

                public void setAddWeight(double addWeight) {
                    this.addWeight = addWeight;
                }

                public int getSupplyId() {
                    return supplyId;
                }

                public void setSupplyId(int supplyId) {
                    this.supplyId = supplyId;
                }

                public int getSalesAmount() {
                    return salesAmount;
                }

                public void setSalesAmount(int salesAmount) {
                    this.salesAmount = salesAmount;
                }

                public boolean isStrictCheck() {
                    return strictCheck;
                }

                public void setStrictCheck(boolean strictCheck) {
                    this.strictCheck = strictCheck;
                }

                public boolean isChecking() {
                    return checking;
                }

                public void setChecking(boolean checking) {
                    this.checking = checking;
                }

                public boolean isEfenbaoIntegralTransable() {
                    return efenbaoIntegralTransable;
                }

                public void setEfenbaoIntegralTransable(boolean efenbaoIntegralTransable) {
                    this.efenbaoIntegralTransable = efenbaoIntegralTransable;
                }

                public boolean isHuiCoinTransable() {
                    return huiCoinTransable;
                }

                public void setHuiCoinTransable(boolean huiCoinTransable) {
                    this.huiCoinTransable = huiCoinTransable;
                }

                public boolean isFuping() {
                    return fuping;
                }

                public void setFuping(boolean fuping) {
                    this.fuping = fuping;
                }

                public int getLimitNumber() {
                    return limitNumber;
                }

                public void setLimitNumber(int limitNumber) {
                    this.limitNumber = limitNumber;
                }

                public long getLimitStartTime() {
                    return limitStartTime;
                }

                public void setLimitStartTime(long limitStartTime) {
                    this.limitStartTime = limitStartTime;
                }

                public long getLimitEndTime() {
                    return limitEndTime;
                }

                public void setLimitEndTime(long limitEndTime) {
                    this.limitEndTime = limitEndTime;
                }

                public long getCreateTime() {
                    return createTime;
                }

                public void setCreateTime(long createTime) {
                    this.createTime = createTime;
                }

                public long getUpdateTime() {
                    return updateTime;
                }

                public void setUpdateTime(long updateTime) {
                    this.updateTime = updateTime;
                }

                public int getSeq() {
                    return seq;
                }

                public void setSeq(int seq) {
                    this.seq = seq;
                }

                public int getStatus() {
                    return status;
                }

                public void setStatus(int status) {
                    this.status = status;
                }

                public String getCheckRemark() {
                    return checkRemark;
                }

                public void setCheckRemark(String checkRemark) {
                    this.checkRemark = checkRemark;
                }

                public String getStatusComm() {
                    return statusComm;
                }

                public void setStatusComm(String statusComm) {
                    this.statusComm = statusComm;
                }

                public String getProductUsefullComm() {
                    return productUsefullComm;
                }

                public void setProductUsefullComm(String productUsefullComm) {
                    this.productUsefullComm = productUsefullComm;
                }
            }
        }
    }

    public static class DataOptionalBean {
        /**
         * present : true
         */

        private boolean present;

        public boolean isPresent() {
            return present;
        }

        public void setPresent(boolean present) {
            this.present = present;
        }
    }
}
