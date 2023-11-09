package ar.edu.unlp.oo1.ejercicio1;

public interface WallPost {
  
  /**
   *
   * @return Retorna el texto descriptivo de la publicación
   */
  String getText();

  /**
   * Setea el texto descriptivo de la publicación
   * @param text - Texto descriptivo a setear
   */
  void setText(String text);

  /**
   * 
   * @return Retorna la cantidad de "me gusta"
   */
  int getLikes();

  /**
   * Incrementa la cantidad de likes en uno
   */
  void like();

  /**
   * Decrementa la cantidad de likes en uno. Si ya es 0, no hace nada
   */
  void dislike();

  /**
   * 
   * @return Retorna true si el post está marcado como destacado, false en caso contrario
   */
  boolean isFeatured();

  /**
   * Cambia el post del estado destacado a no destacado y viceversa
   */
  void toggleFeatured();
}
