package com.example.INFS3605.Fragment;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EventResponse {

    @SerializedName("ID")
    @Expose
    private Integer id;
    @SerializedName("EventDetail")
    @Expose
    private String eventDetail;
    @SerializedName("EventImg")
    @Expose
    private String eventImg;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEventDetail() {
        return eventDetail;
    }

    public void setEventDetail(String eventDetail) {
        this.eventDetail = eventDetail;
    }

    public String getEventImg() {
        return eventImg;
    }

    public void setEventImg(String eventImg) {
        this.eventImg = eventImg;
    }


        public static String json = "[\n" +
                "  {\n" +
                "    \"ID\": 0,\n" +
                "    \"EventDetail\": \"Mavis Phillips (nee Walley) collection - satellite exhibition\\n   21/05/2021 - 9:00am to 25/07/2021 - 5:30pm\\n   State Library of Western Australia - The Nook  WA\",\n" +
                "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/slwa_b4307245_1_master%20%281%29%20%281%29.jpg?itok=yrDtCzfl\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"ID\": 1,\n" +
                "    \"EventDetail\": \"2021 South Australian Government NAIDOC Calendar of Events\\n   24/05/2021 - 1:15pm to 01/08/2021 - 1:15pm\\n   South Australia various venues, communities  SA\",\n" +
                "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/defaults/default4.jpg?itok=nVx01YFs\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"ID\": 2,\n" +
                "    \"EventDetail\": \"BELONGING\\n   01/06/2021 - 10:00am to 14/07/2021 - 4:00pm\\n   The Centre Beaudesert  Qld\",\n" +
                "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/2021_Belonging_logo_Colour.jpg?itok=34x7ZbBl\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"ID\": 3,\n" +
                "    \"EventDetail\": \"Little Bird’s Day -  illustrations from the picture book\\n   11/06/2021 - 9:00pm to 29/08/2021 - 5:30pm\\n   State Library of Western Australia - The Story Place Gallery   WA\",\n" +
                "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/Little%20birds%20day.jpg?itok=E9gQ5KdK\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"ID\": 4,\n" +
                "    \"EventDetail\": \"NAIDOC Week Heal Country! Art Competition\\n   21/06/2021 - 9:00am to 25/07/2021 - 11:00pm\\n   Online  Vic\",\n" +
                "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/NAIDOC%20Week%202021_Postcard.JPG?itok=iI-1Rjzc\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"ID\": 5,\n" +
                "    \"EventDetail\": \"NAIDOC WEEK INDIGENOUS ART EXHIBITION\\n   22/06/2021 - 10:00am to 18/07/2021 - 10:00am\\n   ART SPACE WONTHAGGI. THE CENTENNIAL CENTRE 1 BENT ST WONTHAGGI VIC  Vic\",\n" +
                "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/Naidoc-Art-2021_A4%20jpeg.jpg?itok=h5Bi4Xvk\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"ID\": 6,\n" +
                "    \"EventDetail\": \"MEGAfauna: once there were giants!\\n   26/06/2021 - 8:30am to 25/07/2021 - 5:00pm\\n   Australian National Botanic Gardens  ACT\",\n" +
                "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/ANBG_Megafauna%20once%20there%20were%20giants2.jpg?itok=cDUsbT08\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"ID\": 7,\n" +
                "    \"EventDetail\": \"Healing Country - Healing Nation - Community art exhibition\\n   28/06/2021 - 9:00am to 16/07/2021 - 5:00pm\\n   Port Pirie Regional Art Gallery 3 Wandearah Road Port Pirie  SA\",\n" +
                "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/defaults/default5.jpg?itok=mw401wHJ\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"ID\": 8,\n" +
                "    \"EventDetail\": \"Dibirdibi - Stories from the Mornington Island \\n   01/07/2021 - 8:00am to 14/07/2021 - 4:00pm\\n   West End Art Space   Vic\",\n" +
                "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/FFEB8450-9A30-403A-A36D-D0B59CCBA7CC.jpeg?itok=5FlpwglT\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"ID\": 9,\n" +
                "    \"EventDetail\": \"NAIDOC Reading Challenge\\n   01/07/2021 - 8:00am to 31/07/2021 - 4:00pm\\n   City of Perth Library  WA\",\n" +
                "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/NAIDOC_LibraryChallenge-Facebook.jpg?itok=znPksegq\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"ID\": 10,\n" +
                "    \"EventDetail\": \"Kangaroo Dreaming Colouring Challenge \\n   02/07/2021 - 3:00pm to 12/08/2021 - 5:00pm\\n   Home   NSW\",\n" +
                "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/Kangaroo%20Dreaming%20.jpg?itok=hJnFnN4V\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"ID\": 11,\n" +
                "    \"EventDetail\": \"Celebrate NAIDOC Week 2021 at Monarto Safari Park\\n   03/07/2021 - 9:30am to 19/07/2021 - 5:00pm\\n   Monarto Safari Park  SA\",\n" +
                "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/NAIDOC%20July%20school%20holidays%20Monarto%20Safari%20Park.jpg?itok=qh-5B-UJ\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"ID\": 12,\n" +
                "    \"EventDetail\": \"Dreaming\\n   05/07/2021 - 10:00am to 18/07/2021 - 4:00pm\\n   The Foundry Arts Space, Murray Esplanade, Echuca, Vic  Vic\",\n" +
                "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/1FE25CF1-E817-4C86-B057-97CA91296502.jpeg?itok=kMESD44_\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"ID\": 13,\n" +
                "    \"EventDetail\": \"Art Competition\\n   06/07/2021 - 8:15am to 21/07/2021 - 5:00pm\\n   Maitland NSW  NSW\",\n" +
                "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/Shed%20Bottle%20Cap%20Art.JPG?itok=YUedh9fF\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"ID\": 14,\n" +
                "    \"EventDetail\": \"Colouring In Competition\\n   06/07/2021 - 8:30am to 16/07/2021 - 5:00pm\\n   The Shed, 1/5 Analby Place Maitland  NSW\",\n" +
                "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/defaults/default4.jpg?itok=nVx01YFs\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"ID\": 15,\n" +
                "    \"EventDetail\": \"NAIDOC Week at the Art Gallery of WA\\n   06/07/2021 - 10:00am to 16/07/2021 - 5:00pm\\n   Art Gallery of WA  WA\",\n" +
                "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/1996-0073_WEB.jpg?itok=fSsGpJtQ\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"ID\": 16,\n" +
                "    \"EventDetail\": \"Weaving Connections by Felicity Chapman (Deadly Weavers)\\n   06/07/2021 - 10:30am to 22/08/2021 - 3:30pm\\n   Toowoomba Regional Art Gallery, 531 Ruthven Street Toowoomba  Qld\",\n" +
                "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/DeadlyWeavers_Landscape.jpg?itok=rxyjXfKf\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"ID\": 17,\n" +
                "    \"EventDetail\": \"Earth Burns, Water Cries, Exhibition by Wayne Quilliam\\n   06/07/2021 - 6:00pm to 30/09/2021 - 5:00pm\\n   By appointment  Vic\",\n" +
                "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/waynequilliam2021ArtCA%20%286%29.jpg?itok=lLNI2xnK\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"ID\": 18,\n" +
                "    \"EventDetail\": \"York by Ian Michael and Chris Isaacs\\n   10/07/2021 - 7:30pm to 01/08/2021 - 10:00pm\\n   Heath Ledger Theatre, State Theatre Centre of WA  WA\",\n" +
                "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/Maali.jpg?itok=DpFa3Pvk\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"ID\": 19,\n" +
                "    \"EventDetail\": \"Curtin Creative Jam '21: \\\"Heal Country!\\\" Design Competition\\n   12/07/2021 - 9:00am to 16/07/2021 - 5:00pm\\n   Curtin University MakerSpace  WA\",\n" +
                "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/creative-jam-2021_600px.jpg?itok=iVb3DE0A\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"ID\": 20,\n" +
                "    \"EventDetail\": \"NAIDOC Panel Discussion Webinar: Heal Country, heal our nation.\\n   14/07/2021 - 12:00pm to 1:30pm\\n   Online  NSW\",\n" +
                "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/SCU%20NAIDOC%20image.jpg?itok=H2jHQmxW\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"ID\": 21,\n" +
                "    \"EventDetail\": \"NAIDOC - Candid Conversations\\n   14/07/2021 - 7:00pm to 8:00pm\\n   Online  NSW\",\n" +
                "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/Yvonne_W.jpg?itok=JkLioGfh\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"ID\": 22,\n" +
                "    \"EventDetail\": \"Embracing Our Country\\n   15/07/2021 - 4:00pm to 4:45pm\\n   Online via Zoom  Vic\",\n" +
                "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/defaults/default20.jpg?itok=jjqWLzZY\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"ID\": 23,\n" +
                "    \"EventDetail\": \"NAIDOC Gympie Family Fun Day Celebration\\n   16/07/2021 - 9:30am to 2:00pm\\n   The Pavilion, Gympie Showgrounds, Exhibition Road, Gympie Qld 4570  Qld\",\n" +
                "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/defaults/default20.jpg?itok=jjqWLzZY\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"ID\": 24,\n" +
                "    \"EventDetail\": \"Goompi NAIDOC 2021\\n   16/07/2021 - 10:30am to 2:00pm\\n   Dunwich State School  Qld\",\n" +
                "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/Rohar%20Galea.jpg?itok=1PDmQTzw\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"ID\": 25,\n" +
                "    \"EventDetail\": \"Giynung Ellenbrook NAIDOC 2021\\n   17/07/2021 - 3:00pm to 6:30pm\\n   Ellenbrook Woodlake Amphitheatre  WA\",\n" +
                "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/Giynung%20Ellenbrook%20NAIDOC%202021%20Poster.jpg?itok=vEqaA1c6\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"ID\": 26,\n" +
                "    \"EventDetail\": \"Giynung Ellenbrook NAIDOC Festival 2021\\n   17/07/2021 - 5:45pm to 6:45pm\\n   Woodlake Amphitheater & Park, Fortescue Place, Ellenbrook WA  WA\",\n" +
                "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/FA577505-C394-4CB2-8F1F-1DD25C2CB827.jpeg?itok=aW3HWh2Q\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"ID\": 27,\n" +
                "    \"EventDetail\": \"NAIDOC Virtual Highlights Tour\\n   20/07/2021 - 12:30pm to 1:00pm\\n   Virtual/Online  ACT\",\n" +
                "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/NPG%20Potters%20Pot.jpg?itok=Dc7r4CoW\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"ID\": 28,\n" +
                "    \"EventDetail\": \"MIDWEST NAIDOC 2021\\n   21/07/2021 - 10:00am to 2:00pm\\n   Winfield Street, Morawa  WA\",\n" +
                "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/NAIDOC%20Flyer_0.jpg?itok=-MG4UO8A\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"ID\": 29,\n" +
                "    \"EventDetail\": \"NAIDOC Week Special Showcase Matches\\n   21/07/2021 - 5:00pm to 10:00pm\\n   Darwin Football Stadium Larrakia Park  NT\",\n" +
                "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/FootballNT_15July2020_HR_0010.jpg?itok=peS_0ro9\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"ID\": 30,\n" +
                "    \"EventDetail\": \"Community Fashion Showcase\\n   24/07/2021 - 11:00am to 12:30pm\\n   The Square Mirrabooka  WA\",\n" +
                "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/1080x1920.jpg?itok=B-2qjSez\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"ID\": 31,\n" +
                "    \"EventDetail\": \"Book Club: Benevolence\\n   29/07/2021 - 6:30pm to 7:30pm\\n   Williamstown Library and Online  Vic\",\n" +
                "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/Lenka%20photo%20resized.jpg?itok=v6vRmorg\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"ID\": 32,\n" +
                "    \"EventDetail\": \"NAIDOC Celebrations \\n   30/07/2021 - 4:30pm to 9:00pm\\n   Wembley Sport Park  WA\",\n" +
                "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/defaults/default1.jpg?itok=m1pxRFb7\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"ID\": 33,\n" +
                "    \"EventDetail\": \"NAIDOC Wild Foods & Cultural Festival\\n   31/07/2021 - 10:00am to 2:30pm\\n   Beenleigh Historical Village  Qld\",\n" +
                "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/NAido%20Wild%20Foods%20and%20Cultural%202020-13.jpg?itok=eiSGN9Vm\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"ID\": 34,\n" +
                "    \"EventDetail\": \"Moora Naidoc Ball 2021 (Formal dress)\\n   31/07/2021 - 5:00pm to 10:00pm\\n   MOORA PERFORMING ARTS CENTER   WA\",\n" +
                "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/defaults/default1.jpg?itok=m1pxRFb7\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"ID\": 35,\n" +
                "    \"EventDetail\": \"Dharawal National Park Guided Indigenous Walk – O’Hare’s Lookout Trail\\n   11/09/2021 - 9:00am to 10:30am\\n   Dharawal National Park  NSW\",\n" +
                "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/800%20x%20600%20NAIDOC%20Week.jpg?itok=CXUL4D4Y\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"ID\": 36,\n" +
                "    \"EventDetail\": \"Dharawal National Park Guided Indigenous Walk – 10T Management Trail\\n   11/09/2021 - 9:00am to 10:30am\\n   Dharawal National Park  NSW\",\n" +
                "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/NAIDOC%20800%20x%20600.jpg?itok=xpRbu5Q6\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"ID\": 37,\n" +
                "    \"EventDetail\": \"Logan NAIDOC Family Fun Day\\n   21/09/2021 - 9:00am to 2:30pm\\n   Logan Gardens and Water Park, 12 Civic Parade, Logan Central. Qld\",\n" +
                "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/defaults/default5.jpg?itok=mw401wHJ\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"ID\": 38,\n" +
                "    \"EventDetail\": \"Logan NAIDOC Family Fun Day\\n   30/10/2021 - 10:30am to 2:30pm\\n   Fitzroy Pavilion, Exhibition Park ACT\",\n" +
                "    \"EventImg\": \"https://www.naidoc.org.au/sites/default/files/styles/naidoc_event_image_thumb/public/events-photos/Banner%20-%20NAIDOC%202021.jpg?itok=GGEfIQvB\"\n" +
                "  }\n" +
                "]";
    }

