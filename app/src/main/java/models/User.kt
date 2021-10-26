package models

class User {

    var image_one:Int?= null
    var text_one:String? = null
    var text_two:String? = null
    var image_two:Int? = null
    var text_three:String? = null
    var text_four:String? = null
    var text_five:String? = null
    var text_six:String? = null

    constructor(
        image_one: Int?,
        text_one: String?,
        text_two: String?,
        image_two: Int?,
        text_three: String?,
        text_four: String?,
        text_five: String?,
        text_six: String?
    ) {
        this.image_one = image_one
        this.text_one = text_one
        this.text_two = text_two
        this.image_two = image_two
        this.text_three = text_three
        this.text_four = text_four
        this.text_five = text_five
        this.text_six = text_six
    }
}