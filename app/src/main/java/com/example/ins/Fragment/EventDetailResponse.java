package com.example.ins.Fragment;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EventDetailResponse {

    @SerializedName("Event_ID")
    @Expose
    private Integer eventID;
    @SerializedName("Event_Name")
    @Expose
    private String eventName;
    @SerializedName("latitude")
    @Expose
    private Double latitude;
    @SerializedName("longitude")
    @Expose
    private Double longitude;
    @SerializedName("Location")
    @Expose
    private String location;
    @SerializedName("State")
    @Expose
    private String state;
    @SerializedName("Date_for_sort")
    @Expose
    private String dateForSort;
    @SerializedName("Date")
    @Expose
    private String date;
    @SerializedName("Cost of entry")
    @Expose
    private String costOfEntry;
    @SerializedName("Fee")
    @Expose
    private Integer fee;
    @SerializedName("EventImg")
    @Expose
    private String eventImg;
    @SerializedName("Event Website")
    @Expose
    private String eventWebsite;

    public Integer getEventID() {
        return eventID;
    }

    public void setEventID(Integer eventID) {
        this.eventID = eventID;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDateForSort() {
        return dateForSort;
    }

    public void setDateForSort(String dateForSort) {
        this.dateForSort = dateForSort;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCostOfEntry() {
        return costOfEntry;
    }

    public void setCostOfEntry(String costOfEntry) {
        this.costOfEntry = costOfEntry;
    }

    public Integer getFee() {
        return fee;
    }

    public void setFee(Integer fee) {
        this.fee = fee;
    }

    public String getEventImg() {
        return eventImg;
    }

    public void setEventImg(String eventImg) {
        this.eventImg = eventImg;
    }

    public String getEventWebsite() {
        return eventWebsite;
    }

    public void setEventWebsite(String eventWebsite) {
        this.eventWebsite = eventWebsite;
    }



    public static String json1 = "[\n" +
            "  {\n" +
            "    \"Event_ID\": 0,\n" +
            "    \"Event_Name\": \"Mavis Phillips (nee Walley) collection - satellite exhibition\",\n" +
            "    \"latitude\": -31.9489568,\n" +
            "    \"longitude\": 115.859982,\n" +
            "    \"Location\": \"State Library of Western Australia - The Nook  WA\",\n" +
            "    \"State\": \"WA\",\n" +
            "    \"Date_for_sort\": \"2021/5/21\",\n" +
            "    \"Date\": \"21/05/2021 - 9:00am to 25/07/2021 - 5:30pm\",\n" +
            "    \"Cost of entry\": \"FREE\",\n" +
            "    \"Fee\": 0,\n" +
            "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/slwa_b4307245_1_master%20%281%29%20%281%29.jpg?itok=yrDtCzfl\",\n" +
            "    \"Event Website\": \"https://www.slwa.wa.gov.au/whats-on/events-exhibitions/21521-mavis-phillips-nee-walley-collection-satellite-exhibition\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"Event_ID\": 1,\n" +
            "    \"Event_Name\": \"2021 South Australian Government NAIDOC Calendar of Events\",\n" +
            "    \"latitude\": -31.9489567,\n" +
            "    \"longitude\": 115.8568781,\n" +
            "    \"Location\": \"South Australia various venues, communities  SA\",\n" +
            "    \"State\": \"SA\",\n" +
            "    \"Date_for_sort\": \"2021/5/24\",\n" +
            "    \"Date\": \"24/05/2021 - 1:15pm to 01/08/2021 - 1:15pm\",\n" +
            "    \"Cost of entry\": \"Free and Costed events for Public and internal events\",\n" +
            "    \"Fee\": 0,\n" +
            "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/defaults/default4.jpg?itok=nVx01YFs\",\n" +
            "    \"Event Website\": \"https://www.dpc.sa.gov.au/responsibilities/aboriginal-affairs-and-reconciliation/reconciliation/naidoc-week/naidoc-week-events\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"Event_ID\": 2,\n" +
            "    \"Event_Name\": \"BELONGING\",\n" +
            "    \"latitude\": -27.9873316,\n" +
            "    \"longitude\": 152.994673,\n" +
            "    \"Location\": \"The Centre Beaudesert  Qld\",\n" +
            "    \"State\": \"Qld\",\n" +
            "    \"Date_for_sort\": \"2021/6/1\",\n" +
            "    \"Date\": \"01/06/2021 - 10:00am to 14/07/2021 - 4:00pm\",\n" +
            "    \"Cost of entry\": \"FREE\",\n" +
            "    \"Fee\": 0,\n" +
            "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/2021_Belonging_logo_Colour.jpg?itok=34x7ZbBl\",\n" +
            "    \"Event Website\": \"N/A\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"Event_ID\": 3,\n" +
            "    \"Event_Name\": \"Little Bird’s Day -  illustrations from the picture book\",\n" +
            "    \"latitude\": -31.9489568,\n" +
            "    \"longitude\": 115.859982,\n" +
            "    \"Location\": \"State Library of Western Australia -The Story Place Gallery   WA\",\n" +
            "    \"State\": \"WA\",\n" +
            "    \"Date_for_sort\": \"2021/6/11\",\n" +
            "    \"Date\": \"11/06/2021 - 9:00pm to 29/08/2021 - 5:30pm\",\n" +
            "    \"Cost of entry\": \"FREE\",\n" +
            "    \"Fee\": 0,\n" +
            "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/Little%20birds%20day.jpg?itok=E9gQ5KdK\",\n" +
            "    \"Event Website\": \"https://www.slwa.wa.gov.au/whats-on/events-exhibitions/11621-little-bird%E2%80%99s-day-%E2%80%93-illustrations-picture-book\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"Event_ID\": 4,\n" +
            "    \"Event_Name\": \"NAIDOC Week Heal Country! Art Competition\",\n" +
            "    \"latitude\": 0,\n" +
            "    \"longitude\": 0,\n" +
            "    \"Location\": \"N/A\",\n" +
            "    \"State\": \"A\",\n" +
            "    \"Date_for_sort\": \"2021/6/21\",\n" +
            "    \"Date\": \"21/06/2021 - 9:00am to 25/07/2021 - 11:00pm\",\n" +
            "    \"Cost of entry\": \"FREE\",\n" +
            "    \"Fee\": 0,\n" +
            "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/NAIDOC%20Week%202021_Postcard.JPG?itok=iI-1Rjzc\",\n" +
            "    \"Event Website\": \"https://www.deakin.edu.au/about-deakin/vision-and-values/diversity-and-inclusion/deakin-engagement-and-access-program/naidoc-art-competition\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"Event_ID\": 5,\n" +
            "    \"Event_Name\": \"NAIDOC WEEK INDIGENOUS ART EXHIBITION\",\n" +
            "    \"latitude\": -38.6036368,\n" +
            "    \"longitude\": 145.5914287,\n" +
            "    \"Location\": \"ART SPACE WONTHAGGI. THE CENTENNIAL CENTRE 1 BENT ST WONTHAGGI VIC\",\n" +
            "    \"State\": \"VIC\",\n" +
            "    \"Date_for_sort\": \"2021/6/22\",\n" +
            "    \"Date\": \"22/06/2021 - 10:00am to 18/07/2021 - 10:00am\",\n" +
            "    \"Cost of entry\": \"FREE\",\n" +
            "    \"Fee\": 0,\n" +
            "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/Naidoc-Art-2021_A4%20jpeg.jpg?itok=h5Bi4Xvk\",\n" +
            "    \"Event Website\": \"N/A\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"Event_ID\": 6,\n" +
            "    \"Event_Name\": \"MEGAfauna: once there were giants!\",\n" +
            "    \"latitude\": -35.278878,\n" +
            "    \"longitude\": 149.1067293,\n" +
            "    \"Location\": \"Australian National Botanic Gardens  ACT\",\n" +
            "    \"State\": \"ACT\",\n" +
            "    \"Date_for_sort\": \"2021/6/26\",\n" +
            "    \"Date\": \"26/06/2021 - 8:30am to 25/07/2021 - 5:00pm\",\n" +
            "    \"Cost of entry\": \"FREE\",\n" +
            "    \"Fee\": 0,\n" +
            "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/ANBG_Megafauna%20once%20there%20were%20giants2.jpg?itok=cDUsbT08\",\n" +
            "    \"Event Website\": \"https://parksaustralia.gov.au/botanic-gardens/\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"Event_ID\": 7,\n" +
            "    \"Event_Name\": \"Healing Country - Healing Nation - Community art exhibition\",\n" +
            "    \"latitude\": -33.1810833,\n" +
            "    \"longitude\": 138.0093152,\n" +
            "    \"Location\": \"Port Pirie Regional Art Gallery 3 Wandearah Road Port Pirie  SA\",\n" +
            "    \"State\": \"SA\",\n" +
            "    \"Date_for_sort\": \"2021/6/28\",\n" +
            "    \"Date\": \"28/06/2021 - 9:00am to 16/07/2021 - 5:00pm\",\n" +
            "    \"Cost of entry\": \"FREE\",\n" +
            "    \"Fee\": 0,\n" +
            "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/defaults/default5.jpg?itok=mw401wHJ\",\n" +
            "    \"Event Website\": \"http://pprag.org.au/\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"Event_ID\": 8,\n" +
            "    \"Event_Name\": \"Dibirdibi - Stories from the Mornington Island\",\n" +
            "    \"latitude\": -37.8107349,\n" +
            "    \"longitude\": 144.9456964,\n" +
            "    \"Location\": \"West End Art Space   Vic\",\n" +
            "    \"State\": \"Vic\",\n" +
            "    \"Date_for_sort\": \"2021/7/1\",\n" +
            "    \"Date\": \"01/07/2021 - 8:00am to 14/07/2021 - 4:00pm\",\n" +
            "    \"Cost of entry\": \"FREE\",\n" +
            "    \"Fee\": 0,\n" +
            "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/FFEB8450-9A30-403A-A36D-D0B59CCBA7CC.jpeg?itok=5FlpwglT\",\n" +
            "    \"Event Website\": \"N/A\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"Event_ID\": 9,\n" +
            "    \"Event_Name\": \"NAIDOC Reading Challenge\",\n" +
            "    \"latitude\": -31.9551428,\n" +
            "    \"longitude\": 115.8590965,\n" +
            "    \"Location\": \"City of Perth Library  WA\",\n" +
            "    \"State\": \"WA\",\n" +
            "    \"Date_for_sort\": \"2021/7/1\",\n" +
            "    \"Date\": \"01/07/2021 - 8:00am to 31/07/2021 - 4:00pm\",\n" +
            "    \"Cost of entry\": \"FREE\",\n" +
            "    \"Fee\": 0,\n" +
            "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/NAIDOC_LibraryChallenge-Facebook.jpg?itok=znPksegq\",\n" +
            "    \"Event Website\": \"https://perth.beanstack.org/\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"Event_ID\": 10,\n" +
            "    \"Event_Name\": \"Kangaroo Dreaming Colouring Challenge\",\n" +
            "    \"latitude\": 0,\n" +
            "    \"longitude\": 0,\n" +
            "    \"Location\": \"Home   NSW\",\n" +
            "    \"State\": \"NSW\",\n" +
            "    \"Date_for_sort\": \"2021/7/2\",\n" +
            "    \"Date\": \"02/07/2021 - 3:00pm to 12/08/2021 - 5:00pm\",\n" +
            "    \"Cost of entry\": \"FREE\",\n" +
            "    \"Fee\": 0,\n" +
            "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/Kangaroo%20Dreaming%20.jpg?itok=hJnFnN4V\",\n" +
            "    \"Event Website\": \"https://www.thehills.nsw.gov.au/Library/NAIDOC-Week-2021-Heal-Country\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"Event_ID\": 11,\n" +
            "    \"Event_Name\": \"Celebrate NAIDOC Week 2021 at Monarto Safari Park\",\n" +
            "    \"latitude\": -35.1174914,\n" +
            "    \"longitude\": 139.1368876,\n" +
            "    \"Location\": \"Monarto Safari Park  SA\",\n" +
            "    \"State\": \"SA\",\n" +
            "    \"Date_for_sort\": \"2021/7/3\",\n" +
            "    \"Date\": \"03/07/2021 - 9:30am to 19/07/2021 - 5:00pm\",\n" +
            "    \"Cost of entry\": \"Activities included with park entry ticket\",\n" +
            "    \"Fee\": 0,\n" +
            "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/NAIDOC%20July%20school%20holidays%20Monarto%20Safari%20Park.jpg?itok=qh-5B-UJ\",\n" +
            "    \"Event Website\": \"https://www.monartosafari.com.au/event/july-school-holidays/\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"Event_ID\": 12,\n" +
            "    \"Event_Name\": \"Dreaming\",\n" +
            "    \"latitude\": -36.1224366,\n" +
            "    \"longitude\": 144.7453786,\n" +
            "    \"Location\": \"The Foundry Arts Space, Murray Esplanade, Echuca, Vic  Vic\",\n" +
            "    \"State\": \"Vic\",\n" +
            "    \"Date_for_sort\": \"2021/7/5\",\n" +
            "    \"Date\": \"05/07/2021 - 10:00am to 18/07/2021 - 4:00pm\",\n" +
            "    \"Cost of entry\": \"FREE\",\n" +
            "    \"Fee\": 0,\n" +
            "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/1FE25CF1-E817-4C86-B057-97CA91296502.jpeg?itok=kMESD44_\",\n" +
            "    \"Event Website\": \"N/A\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"Event_ID\": 13,\n" +
            "    \"Event_Name\": \"Art Competition\",\n" +
            "    \"latitude\": 0,\n" +
            "    \"longitude\": 0,\n" +
            "    \"Location\": \"Maitland NSW  NSW\",\n" +
            "    \"State\": \"NSW\",\n" +
            "    \"Date_for_sort\": \"2021/7/6\",\n" +
            "    \"Date\": \"06/07/2021 - 8:15am to 21/07/2021 - 5:00pm\",\n" +
            "    \"Cost of entry\": \"FREE\",\n" +
            "    \"Fee\": 0,\n" +
            "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/Shed%20Bottle%20Cap%20Art.JPG?itok=YUedh9fF\",\n" +
            "    \"Event Website\": \"https://news.wecarensw.com.au/naidoc_colouring_competition\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"Event_ID\": 14,\n" +
            "    \"Event_Name\": \"Colouring In Competition\",\n" +
            "    \"latitude\": -32.7293375,\n" +
            "    \"longitude\": 151.5491236,\n" +
            "    \"Location\": \"The Shed, 1/5 Analby Place Maitland  NSW\",\n" +
            "    \"State\": \"NSW\",\n" +
            "    \"Date_for_sort\": \"2021/7/6\",\n" +
            "    \"Date\": \"06/07/2021 - 8:30am to 16/07/2021 - 5:00pm\",\n" +
            "    \"Cost of entry\": \"FREE\",\n" +
            "    \"Fee\": 0,\n" +
            "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/defaults/default4.jpg?itok=nVx01YFs\",\n" +
            "    \"Event Website\": \"https://news.wecarensw.com.au/naidoc_colouring_competition\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"Event_ID\": 15,\n" +
            "    \"Event_Name\": \"NAIDOC Week at the Art Gallery of WA\",\n" +
            "    \"latitude\": -31.9506988,\n" +
            "    \"longitude\": 115.8590676,\n" +
            "    \"Location\": \"Art Gallery of WA  WA\",\n" +
            "    \"State\": \"WA\",\n" +
            "    \"Date_for_sort\": \"2021/7/6\",\n" +
            "    \"Date\": \"06/07/2021 - 10:00am to 16/07/2021 - 5:00pm\",\n" +
            "    \"Cost of entry\": \"Storytelling is FREE, Workshops are Ticketed\",\n" +
            "    \"Fee\": 0,\n" +
            "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/1996-0073_WEB.jpg?itok=fSsGpJtQ\",\n" +
            "    \"Event Website\": \"https://artgallery.wa.gov.au/whats-on/events/naidoc-week-2021\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"Event_ID\": 16,\n" +
            "    \"Event_Name\": \"Weaving Connections by Felicity Chapman (Deadly Weavers)\",\n" +
            "    \"latitude\": -27.5637412,\n" +
            "    \"longitude\": 151.9504318,\n" +
            "    \"Location\": \"Toowoomba Regional Art Gallery, 531 Ruthven Street Toowoomba  Qld\",\n" +
            "    \"State\": \"Qld\",\n" +
            "    \"Date_for_sort\": \"2021/7/6\",\n" +
            "    \"Date\": \"06/07/2021 - 10:30am to 22/08/2021 - 3:30pm\",\n" +
            "    \"Cost of entry\": \"FREE\",\n" +
            "    \"Fee\": 0,\n" +
            "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/DeadlyWeavers_Landscape.jpg?itok=rxyjXfKf\",\n" +
            "    \"Event Website\": \"N/A\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"Event_ID\": 17,\n" +
            "    \"Event_Name\": \"Earth Burns, Water Cries, Exhibition by Wayne Quilliam\",\n" +
            "    \"latitude\": 0,\n" +
            "    \"longitude\": 0,\n" +
            "    \"Location\": \"By appointment  Vic\",\n" +
            "    \"State\": \"Vic\",\n" +
            "    \"Date_for_sort\": \"2021/7/6\",\n" +
            "    \"Date\": \"06/07/2021 - 6:00pm to 30/09/2021 - 5:00pm\",\n" +
            "    \"Cost of entry\": \"FREE\",\n" +
            "    \"Fee\": 0,\n" +
            "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/waynequilliam2021ArtCA%20%286%29.jpg?itok=lLNI2xnK\",\n" +
            "    \"Event Website\": \"https://www.catherineasquithart.com/livewithart\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"Event_ID\": 18,\n" +
            "    \"Event_Name\": \"York by Ian Michael and Chris Isaacs\",\n" +
            "    \"latitude\": -31.9498611,\n" +
            "    \"longitude\": 115.856799,\n" +
            "    \"Location\": \"Heath Ledger Theatre, State Theatre Centre of WA  WA\",\n" +
            "    \"State\": \"WA\",\n" +
            "    \"Date_for_sort\": \"2021/7/10\",\n" +
            "    \"Date\": \"10/07/2021 - 7:30pm to 01/08/2021 - 10:00pm\",\n" +
            "    \"Cost of entry\": \"$36 - $93\",\n" +
            "    \"Fee\": 36,\n" +
            "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/Maali.jpg?itok=DpFa3Pvk\",\n" +
            "    \"Event Website\": \"N/A\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"Event_ID\": 19,\n" +
            "    \"Event_Name\": \"Curtin Creative Jam '21: \\\"Heal Country!\\\" Design Competition\",\n" +
            "    \"latitude\": -31.9498608,\n" +
            "    \"longitude\": 115.8502329,\n" +
            "    \"Location\": \"Curtin University MakerSpace  WA\",\n" +
            "    \"State\": \"WA\",\n" +
            "    \"Date_for_sort\": \"2021/7/12\",\n" +
            "    \"Date\": \"12/07/2021 - 9:00am to 16/07/2021 - 5:00pm\",\n" +
            "    \"Cost of entry\": \"FREE\",\n" +
            "    \"Fee\": 0,\n" +
            "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/creative-jam-2021_600px.jpg?itok=iVb3DE0A\",\n" +
            "    \"Event Website\": \"https://makerspace.library.curtin.edu.au/creative-jam-2021/\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"Event_ID\": 20,\n" +
            "    \"Event_Name\": \"NAIDOC Panel Discussion Webinar: Heal Country, heal our nation.\",\n" +
            "    \"latitude\": 0,\n" +
            "    \"longitude\": 0,\n" +
            "    \"Location\": \"Online  NSW\",\n" +
            "    \"State\": \"NSW\",\n" +
            "    \"Date_for_sort\": \"2021/7/14\",\n" +
            "    \"Date\": \"14/07/2021 - 12:00pm to 1:30pm\",\n" +
            "    \"Cost of entry\": \"FREE\",\n" +
            "    \"Fee\": 0,\n" +
            "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/SCU%20NAIDOC%20image.jpg?itok=H2jHQmxW\",\n" +
            "    \"Event Website\": \"N/A\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"Event_ID\": 21,\n" +
            "    \"Event_Name\": \"NAIDOC - Candid Conversations\",\n" +
            "    \"latitude\": 0,\n" +
            "    \"longitude\": 0,\n" +
            "    \"Location\": \"Online  NSW\",\n" +
            "    \"State\": \"NSW\",\n" +
            "    \"Date_for_sort\": \"2021/7/14\",\n" +
            "    \"Date\": \"14/07/2021 - 7:00pm to 8:00pm\",\n" +
            "    \"Cost of entry\": \"FREE\",\n" +
            "    \"Fee\": 0,\n" +
            "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/Yvonne_W.jpg?itok=JkLioGfh\",\n" +
            "    \"Event Website\": \"N/A\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"Event_ID\": 22,\n" +
            "    \"Event_Name\": \"Embracing Our Country\",\n" +
            "    \"latitude\": 0,\n" +
            "    \"longitude\": 0,\n" +
            "    \"Location\": \"Online via Zoom  Vic\",\n" +
            "    \"State\": \"Vic\",\n" +
            "    \"Date_for_sort\": \"2021/7/15\",\n" +
            "    \"Date\": \"15/07/2021 - 4:00pm to 4:45pm\",\n" +
            "    \"Cost of entry\": \"FREE\",\n" +
            "    \"Fee\": 0,\n" +
            "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/defaults/default20.jpg?itok=jjqWLzZY\",\n" +
            "    \"Event Website\": \"N/A\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"Event_ID\": 23,\n" +
            "    \"Event_Name\": \"NAIDOC Gympie Family Fun Day Celebration\",\n" +
            "    \"latitude\": -26.2042073,\n" +
            "    \"longitude\": 152.6440592,\n" +
            "    \"Location\": \"The Pavilion, Gympie Showgrounds, Exhibition Road, Gympie Qld 4570  Qld\",\n" +
            "    \"State\": \"Qld\",\n" +
            "    \"Date_for_sort\": \"2021/7/16\",\n" +
            "    \"Date\": \"16/07/2021 - 9:30am to 2:00pm\",\n" +
            "    \"Cost of entry\": \"FREE\",\n" +
            "    \"Fee\": 0,\n" +
            "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/defaults/default20.jpg?itok=jjqWLzZY\",\n" +
            "    \"Event Website\": \"N/A\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"Event_ID\": 24,\n" +
            "    \"Event_Name\": \"Goompi NAIDOC 2021\",\n" +
            "    \"latitude\": -27.4963522,\n" +
            "    \"longitude\": 153.4022035,\n" +
            "    \"Location\": \"Dunwich State School  Qld\",\n" +
            "    \"State\": \"Qld\",\n" +
            "    \"Date_for_sort\": \"2021/7/16\",\n" +
            "    \"Date\": \"16/07/2021 - 10:30am to 2:00pm\",\n" +
            "    \"Cost of entry\": \"FREE\",\n" +
            "    \"Fee\": 0,\n" +
            "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/Rohar%20Galea.jpg?itok=1PDmQTzw\",\n" +
            "    \"Event Website\": \"N/A\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"Event_ID\": 25,\n" +
            "    \"Event_Name\": \"Giynung Ellenbrook NAIDOC 2021\",\n" +
            "    \"latitude\": -31.7904091,\n" +
            "    \"longitude\": 115.9730959,\n" +
            "    \"Location\": \"Ellenbrook Woodlake Amphitheatre  WA\",\n" +
            "    \"State\": \"WA\",\n" +
            "    \"Date_for_sort\": \"2021/7/17\",\n" +
            "    \"Date\": \"17/07/2021 - 3:00pm to 6:30pm\",\n" +
            "    \"Cost of entry\": \"FREE\",\n" +
            "    \"Fee\": 0,\n" +
            "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/Giynung%20Ellenbrook%20NAIDOC%202021%20Poster.jpg?itok=vEqaA1c6\",\n" +
            "    \"Event Website\": \"https://www.facebook.com/groups/3324608927604686/permalink/4268202696578633/\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"Event_ID\": 26,\n" +
            "    \"Event_Name\": \"Giynung Ellenbrook NAIDOC Festival 2021\",\n" +
            "    \"latitude\": -31.7904091,\n" +
            "    \"longitude\": 115.9730959,\n" +
            "    \"Location\": \"Woodlake Amphitheater & Park, Fortescue Place, Ellenbrook WA  WA\",\n" +
            "    \"State\": \"WA\",\n" +
            "    \"Date_for_sort\": \"2021/7/17\",\n" +
            "    \"Date\": \"17/07/2021 - 5:45pm to 6:45pm\",\n" +
            "    \"Cost of entry\": \"Free- Time: 3-6.30pm\",\n" +
            "    \"Fee\": 0,\n" +
            "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/FA577505-C394-4CB2-8F1F-1DD25C2CB827.jpeg?itok=aW3HWh2Q\",\n" +
            "    \"Event Website\": \"N/A\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"Event_ID\": 27,\n" +
            "    \"Event_Name\": \"NAIDOC Virtual Highlights Tour\",\n" +
            "    \"latitude\": 0,\n" +
            "    \"longitude\": 0,\n" +
            "    \"Location\": \"Virtual/Online  ACT\",\n" +
            "    \"State\": \"ACT\",\n" +
            "    \"Date_for_sort\": \"2021/7/20\",\n" +
            "    \"Date\": \"20/07/2021 - 12:30pm to 1:00pm\",\n" +
            "    \"Cost of entry\": \"FREE\",\n" +
            "    \"Fee\": 0,\n" +
            "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/NPG%20Potters%20Pot.jpg?itok=Dc7r4CoW\",\n" +
            "    \"Event Website\": \"https://www.portrait.gov.au/calendar/virtual-highlights-tour-naidoc2021/2276\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"Event_ID\": 28,\n" +
            "    \"Event_Name\": \"MIDWEST NAIDOC 2021\",\n" +
            "    \"latitude\": -29.2112929,\n" +
            "    \"longitude\": 116.0070409,\n" +
            "    \"Location\": \"Winfield Street, Morawa  WA\",\n" +
            "    \"State\": \"WA\",\n" +
            "    \"Date_for_sort\": \"2021/7/21\",\n" +
            "    \"Date\": \"21/07/2021 - 10:00am to 2:00pm\",\n" +
            "    \"Cost of entry\": \"FREE\",\n" +
            "    \"Fee\": 0,\n" +
            "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/NAIDOC%20Flyer_0.jpg?itok=-MG4UO8A\",\n" +
            "    \"Event Website\": \"N/A\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"Event_ID\": 29,\n" +
            "    \"Event_Name\": \"NAIDOC Week Special Showcase Matches\",\n" +
            "    \"latitude\": -12.3969886,\n" +
            "    \"longitude\": 130.8780225,\n" +
            "    \"Location\": \"Darwin Football Stadium Larrakia Park  NT\",\n" +
            "    \"State\": \"NT\",\n" +
            "    \"Date_for_sort\": \"2021/7/21\",\n" +
            "    \"Date\": \"21/07/2021 - 5:00pm to 10:00pm\",\n" +
            "    \"Cost of entry\": \"FREE\",\n" +
            "    \"Fee\": 0,\n" +
            "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/FootballNT_15July2020_HR_0010.jpg?itok=peS_0ro9\",\n" +
            "    \"Event Website\": \"http://footballnt.com.au/\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"Event_ID\": 30,\n" +
            "    \"Event_Name\": \"Community Fashion Showcase\",\n" +
            "    \"latitude\": -31.8713258,\n" +
            "    \"longitude\": 115.8595221,\n" +
            "    \"Location\": \"The Square Mirrabooka  WA\",\n" +
            "    \"State\": \"WA\",\n" +
            "    \"Date_for_sort\": \"2021/7/24\",\n" +
            "    \"Date\": \"24/07/2021 - 11:00am to 12:30pm\",\n" +
            "    \"Cost of entry\": \"FREE\",\n" +
            "    \"Fee\": 0,\n" +
            "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/1080x1920.jpg?itok=B-2qjSez\",\n" +
            "    \"Event Website\": \"https://www.thesquaremirrabooka.com.au/whats-on/events/community-fashion-event\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"Event_ID\": 31,\n" +
            "    \"Event_Name\": \"Book Club: Benevolence\",\n" +
            "    \"latitude\": -31.908287,\n" +
            "    \"longitude\": 115.7843543,\n" +
            "    \"Location\": \"Williamstown Library and Online  Vic\",\n" +
            "    \"State\": \"Vic\",\n" +
            "    \"Date_for_sort\": \"2021/7/29\",\n" +
            "    \"Date\": \"29/07/2021 - 6:30pm to 7:30pm\",\n" +
            "    \"Cost of entry\": \"FREE\",\n" +
            "    \"Fee\": 0,\n" +
            "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/Lenka%20photo%20resized.jpg?itok=v6vRmorg\",\n" +
            "    \"Event Website\": \"https://libraries.hobsonsbay.vic.gov.au/whats-on\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"Event_ID\": 32,\n" +
            "    \"Event_Name\": \"NAIDOC Celebrations\",\n" +
            "    \"latitude\": -31.9447747,\n" +
            "    \"longitude\": 115.8036458,\n" +
            "    \"Location\": \"Wembley Sport Park  WA\",\n" +
            "    \"State\": \"WA\",\n" +
            "    \"Date_for_sort\": \"2021/7/30\",\n" +
            "    \"Date\": \"30/07/2021 - 4:30pm to 9:00pm\",\n" +
            "    \"Cost of entry\": \"FREE\",\n" +
            "    \"Fee\": 0,\n" +
            "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/defaults/default1.jpg?itok=m1pxRFb7\",\n" +
            "    \"Event Website\": \"N/A\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"Event_ID\": 33,\n" +
            "    \"Event_Name\": \"NAIDOC Wild Foods & Cultural Festival\",\n" +
            "    \"latitude\": -27.7232148,\n" +
            "    \"longitude\": 153.2116198,\n" +
            "    \"Location\": \"Beenleigh Historical Village  Qld\",\n" +
            "    \"State\": \"Qld\",\n" +
            "    \"Date_for_sort\": \"2021/7/31\",\n" +
            "    \"Date\": \"31/07/2021 - 10:00am to 2:30pm\",\n" +
            "    \"Cost of entry\": \"FREE. Gold Coin donation appreciated\",\n" +
            "    \"Fee\": 0,\n" +
            "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/NAido%20Wild%20Foods%20and%20Cultural%202020-13.jpg?itok=eiSGN9Vm\",\n" +
            "    \"Event Website\": \"N/A\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"Event_ID\": 34,\n" +
            "    \"Event_Name\": \"Moora Naidoc Ball 2021 (Formal dress)\",\n" +
            "    \"latitude\": -30.6420752,\n" +
            "    \"longitude\": 116.0076964,\n" +
            "    \"Location\": \"MOORA PERFORMING ARTS CENTER   WA\",\n" +
            "    \"State\": \"WA\",\n" +
            "    \"Date_for_sort\": \"2021/7/31\",\n" +
            "    \"Date\": \"31/07/2021 - 5:00pm to 10:00pm\",\n" +
            "    \"Cost of entry\": \"Adults $15             School aged Children $5\",\n" +
            "    \"Fee\": 15,\n" +
            "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/defaults/default1.jpg?itok=m1pxRFb7\",\n" +
            "    \"Event Website\": \"https://libraries.hobsonsbay.vic.gov.au/whats-on\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"Event_ID\": 35,\n" +
            "    \"Event_Name\": \"Dharawal National Park Guided Indigenous Walk – O’Hare’s Lookout Trail\",\n" +
            "    \"latitude\": -34.1582674,\n" +
            "    \"longitude\": 150.8273217,\n" +
            "    \"Location\": \"Dharawal National Park  NSW\",\n" +
            "    \"State\": \"NSW\",\n" +
            "    \"Date_for_sort\": \"2021/9/11\",\n" +
            "    \"Date\": \"11/09/2021 - 9:00am to 10:30am\",\n" +
            "    \"Cost of entry\": \"$15 per person, $10 per child\",\n" +
            "    \"Fee\": 15,\n" +
            "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/800%20x%20600%20NAIDOC%20Week.jpg?itok=CXUL4D4Y\",\n" +
            "    \"Event Website\": \"https://visitcampbelltown.com.au/events/dharawal-guided-indigenous-walk-ohares-lookout-trail/\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"Event_ID\": 36,\n" +
            "    \"Event_Name\": \"Dharawal National Park Guided Indigenous Walk – 10T Management Trail\",\n" +
            "    \"latitude\": -34.1582674,\n" +
            "    \"longitude\": 150.8273217,\n" +
            "    \"Location\": \"Dharawal National Park  NSW\",\n" +
            "    \"State\": \"NSW\",\n" +
            "    \"Date_for_sort\": \"2021/9/11\",\n" +
            "    \"Date\": \"11/09/2021 - 9:00am to 10:30am\",\n" +
            "    \"Cost of entry\": \"$35 per person, $18 per child\",\n" +
            "    \"Fee\": 35,\n" +
            "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/NAIDOC%20800%20x%20600.jpg?itok=xpRbu5Q6\",\n" +
            "    \"Event Website\": \"https://visitcampbelltown.com.au/events/dharawal-guided-indigenous-walk-minerva-pool-trail/\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"Event_ID\": 37,\n" +
            "    \"Event_Name\": \"Logan NAIDOC Family Fun Day\",\n" +
            "    \"latitude\": -27.6469785,\n" +
            "    \"longitude\": 153.1019027,\n" +
            "    \"Location\": \"Logan Gardens and Water Park, 12 Civic Parade, Logan Central. Qld\",\n" +
            "    \"State\": \"Qld\",\n" +
            "    \"Date_for_sort\": \"2021/9/21\",\n" +
            "    \"Date\": \"21/09/2021 - 9:00am to 2:30pm\",\n" +
            "    \"Cost of entry\": \"FREE\",\n" +
            "    \"Fee\": 0,\n" +
            "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/defaults/default5.jpg?itok=mw401wHJ\",\n" +
            "    \"Event Website\": \"N/A\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"Event_ID\": 38,\n" +
            "    \"Event_Name\": \"NAIDOC in the North\",\n" +
            "    \"latitude\": -35.2313734,\n" +
            "    \"longitude\": 149.1468755,\n" +
            "    \"Location\": \"Fitzroy Pavilion, Exhibition Park ACT\",\n" +
            "    \"State\": \"ACT\",\n" +
            "    \"Date_for_sort\": \"2021/9/30\",\n" +
            "    \"Date\": \"30/10/2021 - 10:30am to 2:30pm\",\n" +
            "    \"Cost of entry\": \"FREE\",\n" +
            "    \"Fee\": 0,\n" +
            "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/Banner%20-%20NAIDOC%202021.jpg?itok=GGEfIQvB\",\n" +
            "    \"Event Website\": \"http://www.belcoarts.com.au/naidoc\"\n" +
            "  }\n" +
            "]";
}
