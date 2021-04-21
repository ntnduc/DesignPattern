package tdtu.Contact.contact;


import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Named
@Path("/")
public class CalcEndpoint {

    @GET
    @Produces({"application/json", "application/x-msgpack"})
    @Path("calc")
    public Result calc(@QueryParam("left") int left, @QueryParam("right") int right) {
        return new Result(left, right, left + right);
    }

    static class Result {
        private int left;
        private int right;
        private long answer;

        public Result(int left, int right, long answer) {
            this.left = left;
            this.right = right;
            this.answer = answer;
        }

        public Result() {
        }

        public int getLeft() {
            return left;
        }

        public void setLeft(int left) {
            this.left = left;
        }

        public int getRight() {
            return right;
        }

        public void setRight(int right) {
            this.right = right;
        }

        public long getAnswer() {
            return answer;
        }

        public void setAnswer(long answer) {
            this.answer = answer;
        }
    }
}
