package Pack;


import org.springframework.stereotype.Component;

@Component
    public class PlaceDTO {

        private String title= "No place";
        private double longtitude=0;
        private double latitude=0;
        private String description="No description";

        public String getTitle() {return title;}

        public void setTitle(String title) {
            this.title = title;
        }

        public double getLongtitude() {
            return longtitude;
        }

        public void setLongtitude(double longtitude) {
            this.longtitude = longtitude;
        }

        public double getLatitude() {
            return latitude;
        }

        public void setLatitude(double latitude) {
            this.latitude = latitude;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }

