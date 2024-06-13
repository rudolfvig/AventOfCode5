public record MapElement(Long destinationStart, Long sourceStart, Long range) {
    public Long findDestination(Long source){
        long sourceEnd = sourceStart + range - 1;
        if (sourceStart > source || sourceEnd < source)  return -1L;

        return destinationStart + (source - sourceStart);
    }
}
