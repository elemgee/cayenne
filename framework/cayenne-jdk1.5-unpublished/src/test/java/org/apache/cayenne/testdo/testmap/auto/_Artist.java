package org.apache.cayenne.testdo.testmap.auto;

import java.util.Date;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.testdo.testmap.ArtGroup;
import org.apache.cayenne.testdo.testmap.ArtistExhibit;
import org.apache.cayenne.testdo.testmap.Painting;

/**
 * Class _Artist was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Artist extends CayenneDataObject {

    public static final String ARTIST_NAME_PROPERTY = "artistName";
    public static final String DATE_OF_BIRTH_PROPERTY = "dateOfBirth";
    public static final String ARTIST_EXHIBIT_ARRAY_PROPERTY = "artistExhibitArray";
    public static final String GROUP_ARRAY_PROPERTY = "groupArray";
    public static final String PAINTING_ARRAY_PROPERTY = "paintingArray";

    public static final String ARTIST_ID_PK_COLUMN = "ARTIST_ID";

    public void setArtistName(String artistName) {
        writeProperty(ARTIST_NAME_PROPERTY, artistName);
    }
    public String getArtistName() {
        return (String)readProperty(ARTIST_NAME_PROPERTY);
    }

    public void setDateOfBirth(Date dateOfBirth) {
        writeProperty(DATE_OF_BIRTH_PROPERTY, dateOfBirth);
    }
    public Date getDateOfBirth() {
        return (Date)readProperty(DATE_OF_BIRTH_PROPERTY);
    }

    public void addToArtistExhibitArray(ArtistExhibit obj) {
        addToManyTarget(ARTIST_EXHIBIT_ARRAY_PROPERTY, obj, true);
    }
    public void removeFromArtistExhibitArray(ArtistExhibit obj) {
        removeToManyTarget(ARTIST_EXHIBIT_ARRAY_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<ArtistExhibit> getArtistExhibitArray() {
        return (List<ArtistExhibit>)readProperty(ARTIST_EXHIBIT_ARRAY_PROPERTY);
    }


    public void addToGroupArray(ArtGroup obj) {
        addToManyTarget(GROUP_ARRAY_PROPERTY, obj, true);
    }
    public void removeFromGroupArray(ArtGroup obj) {
        removeToManyTarget(GROUP_ARRAY_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<ArtGroup> getGroupArray() {
        return (List<ArtGroup>)readProperty(GROUP_ARRAY_PROPERTY);
    }


    public void addToPaintingArray(Painting obj) {
        addToManyTarget(PAINTING_ARRAY_PROPERTY, obj, true);
    }
    public void removeFromPaintingArray(Painting obj) {
        removeToManyTarget(PAINTING_ARRAY_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Painting> getPaintingArray() {
        return (List<Painting>)readProperty(PAINTING_ARRAY_PROPERTY);
    }


}