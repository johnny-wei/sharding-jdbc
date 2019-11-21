package com.example.shardingjdbc.entity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author wy
*/
public class Order implements Serializable {

    private static final long serialVersionUID = 1574345554661L;


    /**
    * 主键
    * 主键ID
    * isNullAble:0
    */
    private Long id;

    /**
    * 用户ID
    * isNullAble:1
    */
    private Long user_id;

    /**
    * 订单ID
    * isNullAble:1
    */
    private Long order_id;


    public void setId(Long id){this.id = id;}

    public Long getId(){return this.id;}

    public void setUser_id(Long user_id){this.user_id = user_id;}

    public Long getUser_id(){return this.user_id;}

    public void setOrder_id(Long order_id){this.order_id = order_id;}

    public Long getOrder_id(){return this.order_id;}
    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                "user_id='" + user_id + '\'' +
                "order_id='" + order_id + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private Order set;

        private ConditionBuilder where;

        public UpdateBuilder set(Order set){
            this.set = set;
            return this;
        }

        public Order getSet(){
            return this.set;
        }

        public UpdateBuilder where(ConditionBuilder where){
            this.where = where;
            return this;
        }

        public ConditionBuilder getWhere(){
            return this.where;
        }

        public UpdateBuilder build(){
            return this;
        }
    }

    public static class QueryBuilder extends Order{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Long> idList;

        public List<Long> getIdList(){return this.idList;}

        private Long idSt;

        private Long idEd;

        public Long getIdSt(){return this.idSt;}

        public Long getIdEd(){return this.idEd;}

        private List<Long> user_idList;

        public List<Long> getUser_idList(){return this.user_idList;}

        private Long user_idSt;

        private Long user_idEd;

        public Long getUser_idSt(){return this.user_idSt;}

        public Long getUser_idEd(){return this.user_idEd;}

        private List<Long> order_idList;

        public List<Long> getOrder_idList(){return this.order_idList;}

        private Long order_idSt;

        private Long order_idEd;

        public Long getOrder_idSt(){return this.order_idSt;}

        public Long getOrder_idEd(){return this.order_idEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder idBetWeen(Long idSt,Long idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public QueryBuilder idGreaterEqThan(Long idSt){
            this.idSt = idSt;
            return this;
        }
        public QueryBuilder idLessEqThan(Long idEd){
            this.idEd = idEd;
            return this;
        }


        public QueryBuilder id(Long id){
            setId(id);
            return this;
        }

        public QueryBuilder idList(Long ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public QueryBuilder idList(List<Long> id){
            this.idList = id;
            return this;
        }

        public QueryBuilder fetchId(){
            setFetchFields("fetchFields","id");
            return this;
        }

        public QueryBuilder excludeId(){
            setFetchFields("excludeFields","id");
            return this;
        }

        public QueryBuilder user_idBetWeen(Long user_idSt,Long user_idEd){
            this.user_idSt = user_idSt;
            this.user_idEd = user_idEd;
            return this;
        }

        public QueryBuilder user_idGreaterEqThan(Long user_idSt){
            this.user_idSt = user_idSt;
            return this;
        }
        public QueryBuilder user_idLessEqThan(Long user_idEd){
            this.user_idEd = user_idEd;
            return this;
        }


        public QueryBuilder user_id(Long user_id){
            setUser_id(user_id);
            return this;
        }

        public QueryBuilder user_idList(Long ... user_id){
            this.user_idList = solveNullList(user_id);
            return this;
        }

        public QueryBuilder user_idList(List<Long> user_id){
            this.user_idList = user_id;
            return this;
        }

        public QueryBuilder fetchUser_id(){
            setFetchFields("fetchFields","user_id");
            return this;
        }

        public QueryBuilder excludeUser_id(){
            setFetchFields("excludeFields","user_id");
            return this;
        }

        public QueryBuilder order_idBetWeen(Long order_idSt,Long order_idEd){
            this.order_idSt = order_idSt;
            this.order_idEd = order_idEd;
            return this;
        }

        public QueryBuilder order_idGreaterEqThan(Long order_idSt){
            this.order_idSt = order_idSt;
            return this;
        }
        public QueryBuilder order_idLessEqThan(Long order_idEd){
            this.order_idEd = order_idEd;
            return this;
        }


        public QueryBuilder order_id(Long order_id){
            setOrder_id(order_id);
            return this;
        }

        public QueryBuilder order_idList(Long ... order_id){
            this.order_idList = solveNullList(order_id);
            return this;
        }

        public QueryBuilder order_idList(List<Long> order_id){
            this.order_idList = order_id;
            return this;
        }

        public QueryBuilder fetchOrder_id(){
            setFetchFields("fetchFields","order_id");
            return this;
        }

        public QueryBuilder excludeOrder_id(){
            setFetchFields("excludeFields","order_id");
            return this;
        }
        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public QueryBuilder fetchAll(){
            this.fetchFields.put("AllFields",true);
            return this;
        }

        public QueryBuilder addField(String ... fields){
            List<String> list = new ArrayList<>();
            if (fields != null){
                for (String field : fields){
                    list.add(field);
                }
            }
            this.fetchFields.put("otherFields",list);
            return this;
        }
        @SuppressWarnings("unchecked")
        private void setFetchFields(String key,String val){
            Map<String,Boolean> fields= (Map<String, Boolean>) this.fetchFields.get(key);
            if (fields == null){
                fields = new HashMap<>();
            }
            fields.put(val,true);
            this.fetchFields.put(key,fields);
        }

        public Order build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Long> idList;

        public List<Long> getIdList(){return this.idList;}

        private Long idSt;

        private Long idEd;

        public Long getIdSt(){return this.idSt;}

        public Long getIdEd(){return this.idEd;}

        private List<Long> user_idList;

        public List<Long> getUser_idList(){return this.user_idList;}

        private Long user_idSt;

        private Long user_idEd;

        public Long getUser_idSt(){return this.user_idSt;}

        public Long getUser_idEd(){return this.user_idEd;}

        private List<Long> order_idList;

        public List<Long> getOrder_idList(){return this.order_idList;}

        private Long order_idSt;

        private Long order_idEd;

        public Long getOrder_idSt(){return this.order_idSt;}

        public Long getOrder_idEd(){return this.order_idEd;}


        public ConditionBuilder idBetWeen(Long idSt,Long idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public ConditionBuilder idGreaterEqThan(Long idSt){
            this.idSt = idSt;
            return this;
        }
        public ConditionBuilder idLessEqThan(Long idEd){
            this.idEd = idEd;
            return this;
        }


        public ConditionBuilder idList(Long ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public ConditionBuilder idList(List<Long> id){
            this.idList = id;
            return this;
        }

        public ConditionBuilder user_idBetWeen(Long user_idSt,Long user_idEd){
            this.user_idSt = user_idSt;
            this.user_idEd = user_idEd;
            return this;
        }

        public ConditionBuilder user_idGreaterEqThan(Long user_idSt){
            this.user_idSt = user_idSt;
            return this;
        }
        public ConditionBuilder user_idLessEqThan(Long user_idEd){
            this.user_idEd = user_idEd;
            return this;
        }


        public ConditionBuilder user_idList(Long ... user_id){
            this.user_idList = solveNullList(user_id);
            return this;
        }

        public ConditionBuilder user_idList(List<Long> user_id){
            this.user_idList = user_id;
            return this;
        }

        public ConditionBuilder order_idBetWeen(Long order_idSt,Long order_idEd){
            this.order_idSt = order_idSt;
            this.order_idEd = order_idEd;
            return this;
        }

        public ConditionBuilder order_idGreaterEqThan(Long order_idSt){
            this.order_idSt = order_idSt;
            return this;
        }
        public ConditionBuilder order_idLessEqThan(Long order_idEd){
            this.order_idEd = order_idEd;
            return this;
        }


        public ConditionBuilder order_idList(Long ... order_id){
            this.order_idList = solveNullList(order_id);
            return this;
        }

        public ConditionBuilder order_idList(List<Long> order_id){
            this.order_idList = order_id;
            return this;
        }

        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public ConditionBuilder build(){return this;}
    }

    public static class Builder {

        private Order obj;

        public Builder(){
            this.obj = new Order();
        }

        public Builder id(Long id){
            this.obj.setId(id);
            return this;
        }
        public Builder user_id(Long user_id){
            this.obj.setUser_id(user_id);
            return this;
        }
        public Builder order_id(Long order_id){
            this.obj.setOrder_id(order_id);
            return this;
        }
        public Order build(){return obj;}
    }

}
